package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(
                "Java",
                "Curso de Java",
                8
        );
        Curso curso2 = new Curso(
                "JavaScript",
                "Curso de JavaScript",
                4
        );

        Mentoria mentoria = new Mentoria(
                "Mentoria de Java",
                "descrição mentoria Java",
                LocalDate.now()
                );

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);





    }
}
