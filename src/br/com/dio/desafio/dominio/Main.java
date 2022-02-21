package br.com.dio.desafio.dominio;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // criando cursos
        System.out.println("CURSOS");
        Conteudo curso1 = new Curso(
                "Java",
                "Curso de Java",
                8
        );
        System.out.println(curso1);
        Conteudo curso2 = new Curso(
                "JavaScript",
                "Curso de JavaScript",
                4
        );
        System.out.println(curso2);

        // criando mentoria
        System.out.println("MENTORIAS");
        Conteudo mentoria = new Mentoria(
                "Mentoria de Java",
                "descrição mentoria Java",
                LocalDate.now()
                );
        System.out.println(mentoria);

        // criando bootcamp e inserindo os conteúdos
        System.out.println("BOOTCAMP");
        System.out.println("O bootcamp tem 2 cursos e 1 mentoria");
        Bootcamp b = new Bootcamp(
                "Bootcamp Java Developer",
                "Descrição Bootcamp Java Developer"
        );
        b.getConteudos().add(curso1);
        b.getConteudos().add(curso2);
        b.getConteudos().add(mentoria);
        System.out.println(b);

        // criando devs
        System.out.println("DEVs");
        Dev dev1 = new Dev("Camila");
        System.out.println(dev1);
        Dev dev2 = new Dev("João");
        System.out.println(dev2);

        // inscrevendo devs no bootcamp
        System.out.println("Devs aparecem inscritos no bootcamp...");
        dev1.inscreverBootcamp(b);
        System.out.println(dev1);
        dev2.inscreverBootcamp(b);
        System.out.println(dev2);

        // mostrando conteúdos inscritos por devs
        System.out.println("Conteúdos inscritos pelos devs");
        System.out.println(dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println(dev2.getNome() + ": " + dev2.getConteudosInscritos());

        // mostrando conteúdos concluídos por devs
        System.out.println("Conteúdos concluídos pelos devs");
        System.out.println(dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println(dev2.getNome() + ": " + dev2.getConteudosConcluidos());

        // progredindo...
        System.out.println("Progredindo no bootcamp...");
        dev1.progredir();
        dev2.progredir();

        // mostrando conteúdos inscritos por devs
        System.out.println("Conteúdos inscritos pelos devs");
        System.out.println(dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println(dev2.getNome() + ": " + dev2.getConteudosInscritos());

        // mostrando conteúdos concluídos por devs
        System.out.println("Conteúdos concluídos pelos devs");
        System.out.println(dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println(dev2.getNome() + ": " + dev2.getConteudosConcluidos());



    }
}
