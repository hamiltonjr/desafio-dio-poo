package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private final String titulo;
    private final String descricao;
    private final LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return  "Mentoria{" +
                "Título: " + titulo + ", " +
                "Descrição: " + descricao + ", " +
                "Data: " + data + "}\n";
    }

}
