package com.example.pokedex;

public class Pokemon {
    private long id;
    private String name;
    private String type;
    private String description;

    public Pokemon(long id, String name, String type, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this. description = description;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }
}