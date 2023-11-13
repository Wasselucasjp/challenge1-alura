package com.alura.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VideosContoller {

    @GetMapping("/videos")
    public String  getAll(){
        return "Aqui exibe todos os videos";
    }

   


}
