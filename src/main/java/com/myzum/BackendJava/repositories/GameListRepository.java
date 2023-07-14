package com.myzum.BackendJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myzum.BackendJava.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
