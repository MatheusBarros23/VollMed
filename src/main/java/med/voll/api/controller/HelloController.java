package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //Mapeando
public class HelloController {

    @GetMapping  //Chamo esse metodo
    public String olaMundo(){
        return "Hello World!";
    }
}
