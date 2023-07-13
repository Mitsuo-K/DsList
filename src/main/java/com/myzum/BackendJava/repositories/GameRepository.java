package com.myzum.BackendJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myzum.BackendJava.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
