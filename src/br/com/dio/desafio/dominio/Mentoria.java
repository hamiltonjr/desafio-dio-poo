package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.data = LocalDate.now().plusDays(10);
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{"  + super.toString() +
                "data=" + data +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20.0;
    }

}
