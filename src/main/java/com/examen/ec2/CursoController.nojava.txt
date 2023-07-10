package com.examen.ec2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.lang.String;
@RestController
@RequestMapping("/api/curso")
public class CursoController {
	@Autowired 
	private CursoRepository cursoRepository;

	@PostMapping("/nuevo") 
	public ResponseEntity<?> addNewCurso (@RequestParam String nombre
			, @RequestParam int creditos) {
		Curso curso = new Curso();
		curso.setNombre(nombre);
        curso.setCreditos(creditos);
		cursoRepository.save(curso);
		return ResponseEntity.ok("Saved");
	}

	@DeleteMapping("/eliminar")
	public ResponseEntity<?> delCurso (@RequestParam Integer id) {
		Curso curso = new Curso();
		curso.setId(id);
		cursoRepository.delete(curso);
		return ResponseEntity.ok("Deleted");
	}
	@GetMapping("/listar")
	public ResponseEntity<?> getAllCursos() {
		return ResponseEntity.ok(cursoRepository.findAll());
	}
}