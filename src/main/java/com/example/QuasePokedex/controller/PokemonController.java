package com.example.QuasePokedex.controller;

import com.example.QuasePokedex.model.Pokemon;
import com.example.QuasePokedex.repository.PokemonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("pokemons")
public class PokemonController {

    private PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @PostMapping
    public void save(@RequestBody Pokemon pokemon){
        String id = UUID.randomUUID().toString();
        pokemon.setId(id);
        pokemonRepository.save(pokemon);

        System.out.println("Pokemon salvo! " + pokemon);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        pokemonRepository.deleteById(id);
    }
}
