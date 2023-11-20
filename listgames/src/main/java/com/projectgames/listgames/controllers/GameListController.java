package com.projectgames.listgames.controllers;

import com.projectgames.listgames.dto.GameDTO;
import com.projectgames.listgames.dto.GameListDTO;
import com.projectgames.listgames.dto.GameMinDTO;
import com.projectgames.listgames.services.GameListService;
import com.projectgames.listgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
