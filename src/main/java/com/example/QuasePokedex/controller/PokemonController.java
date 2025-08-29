package com.example.QuasePokedex.controller;

import com.example.QuasePokedex.model.Pokemon;
import com.example.QuasePokedex.repository.PokemonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("pokemons")
public class PokemonController {

    private PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Pokemon pokemon){

        String error = pokemon.validate();
        if (error != null){
            return ResponseEntity.badRequest().body(error);  // obrigado chatGPT
        }

        String id = UUID.randomUUID().toString();
        pokemon.setId(id);
        Pokemon pokemonSaved = pokemonRepository.save(pokemon);

        return ResponseEntity.status(HttpStatus.CREATED).body(pokemonSaved);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        pokemonRepository.deleteById(id);
    }

    @GetMapping("{id}")
    public Pokemon getById(@PathVariable("id") String id){
        return pokemonRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Pokemon> getAll(){
        return pokemonRepository.findAll();
    }

    @PutMapping("{id}")
    public void update (@PathVariable("id") String id, @RequestBody Pokemon pokemon ){
        pokemon.setId(id);
        pokemonRepository.save(pokemon);
    }
}
