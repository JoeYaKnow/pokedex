package com.example.pokedex;


import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PokedexService {
    private static List<Pokemon> Pokedex = new ArrayList<>(
            Arrays.asList(
                    new Pokemon(1, "Pikachu", "Electric", "Large spicy mouse"),
                    new Pokemon(2, "Blastoise", "Water", "Massive squirting turtle"),
                    new Pokemon(3, "Charizard", "Fire", "Bigass dragon thing")
            )
        );
    public List<Pokemon> getPokedex(){
        return Pokedex;
    }

    public Pokemon getPokemon(Integer id) {

        return Pokedex.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addPokemon(Pokemon pokemon) {
        Pokedex.add(pokemon);
    }


}
