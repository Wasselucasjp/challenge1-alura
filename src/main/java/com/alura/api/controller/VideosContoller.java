package com.alura.api.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VideosContoller {

    @GetMapping("/videos")
    public String  getAll(){
        return "Aqui exibe todos os videos";
    }


    @GetMapping("/videos/{id}")
    public String getVideoById(){
        return "Aqui exibe um video por id";
    }

    @PostMapping("/videos")
    public String createVideo(String newVideo) {
        return "Criando video";
    }

    @PutMapping("/videos/{id}")
    public String upadateVideo(@PathVariable String id){
        return "video atualizado";
    }

    @DeleteMapping("/videos/{id}")
    public String deleteVideoById(@PathVariable String id){
        return "Video deletado por id";
    }

}
