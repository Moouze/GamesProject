package com.projectgames.listgames.services;

import com.projectgames.listgames.dto.GameMinDTO;
import com.projectgames.listgames.entities.Game;
import com.projectgames.listgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
