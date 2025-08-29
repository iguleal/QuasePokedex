package com.example.QuasePokedex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemons")
public class Pokemon {

    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String validate() {
        if (name == null || name.isBlank()) {
            return "O campo 'name' é obrigatório";
        }
        if (type == null || type.isBlank()) {
            return "O campo 'type' é obrigatório";
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pokemon {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
