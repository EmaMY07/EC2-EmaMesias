package com.examen.ec2;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="carrera")
public class Carrera {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;
    @OneToMany(targetEntity=Curso.class,mappedBy="carrera")
    @OrderBy("nombre ASC")
    private Set<Curso> cursos=new HashSet<>();

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
     public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Carrera [id=" + id + ", nombre=" + nombre + "]";
    }
}