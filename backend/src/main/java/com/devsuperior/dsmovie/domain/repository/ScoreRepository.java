package com.devsuperior.dsmovie.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.domain.model.Score;
import com.devsuperior.dsmovie.domain.model.ScorePK;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
