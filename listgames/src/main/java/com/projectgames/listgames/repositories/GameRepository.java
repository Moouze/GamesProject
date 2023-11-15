package com.projectgames.listgames.repositories;

import com.projectgames.listgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
