package com.example.gerenciador_pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")

public class Categoria {

    @Id
    private Long id;
    private String nome;

    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Categoria(){}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
