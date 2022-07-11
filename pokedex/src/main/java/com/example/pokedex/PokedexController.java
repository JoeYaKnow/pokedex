package com.example.pokedex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokedexController {

    @Autowired
    private PokedexService pokedexService;

    @GetMapping("/pokedex")
        public List<Pokemon> getPokedex() {
        return pokedexService.getPokedex();
    }

/*    @GetMapping("/pokedex/{id}")
    public Pokemon getPokemon(@PathVariable Integer id) {
        return pokedexService.getPokemon(id);
    }*/

    @PostMapping("/pokedex")
        public void addPokemon(@RequestBody Pokemon pokemon){
            pokedexService.addPokemon(pokemon);
    }

}
