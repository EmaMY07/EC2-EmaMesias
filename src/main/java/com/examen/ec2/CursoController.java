package com.examen.ec2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.lang.String;


@Controller
@RequestMapping(path="/api/curso")
public class CursoController {
	@Autowired 
	private CursoRepository cursoRepository;

	@PostMapping(path="/nuevo") 
	public @ResponseBody String addNewCurso (@RequestParam String nombre
			, @RequestParam int creditos) {
		Curso curso = new Curso();
		curso.setNombre(nombre);
        curso.setCreditos(creditos);
		cursoRepository.save(curso);
		return "Saved";
	}

	@DeleteMapping(path="/eliminar")
	public @ResponseBody String delCurso (@RequestParam Integer id) {
		Curso curso = new Curso();
		curso.setId(id);
		cursoRepository.delete(curso);
		return "Deleted";
	}
	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Curso> getAllCursos() {
		return cursoRepository.findAll();
	}
}