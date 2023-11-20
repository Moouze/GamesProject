package com.projectgames.listgames.repositories;

import com.projectgames.listgames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
