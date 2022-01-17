package com.devsuperior.dsmovie.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.domain.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
