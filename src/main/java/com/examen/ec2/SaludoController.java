package com.examen.ec2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SaludoController {
    @GetMapping("/idat/codigo")
    public String codigo(){
        return "PT72380955";
    }
    @GetMapping
    public String holaEma(){
        return "PT72380955 -EMA FERNANDA MESIAS YACZA";
    }
    @GetMapping("/idat/nombre-completo")
    public String nombre(){
        return "EMA FERNANDA MESIAS YACZA";
    }
}