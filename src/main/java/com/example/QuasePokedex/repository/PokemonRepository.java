package com.example.QuasePokedex.repository;

import com.example.QuasePokedex.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, String> {

}
