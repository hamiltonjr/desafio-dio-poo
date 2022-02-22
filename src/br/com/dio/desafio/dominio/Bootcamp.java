package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp<localDate> {
    private String nome;
    private String descrição;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;

    public Bootcamp(String nome, String descrição) {
        this.nome = nome;
        this.descrição = descrição;
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
        this.devsInscritos = new HashSet<>();
        this.conteudos = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp<?> bootcamp = (Bootcamp<?>) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descrição, bootcamp.descrição) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descrição, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    @Override
    public String toString() {
        return  "Bootcamp\n" +
                "Nome: " + nome + "\n" +
                "Descrição: " + descrição + "\n" +
                "Data Inicial: " + dataInicial + "\n" +
                "Data Final: " + dataFinal + "\n";
    }
}
