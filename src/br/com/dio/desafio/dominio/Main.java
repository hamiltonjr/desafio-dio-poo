package br.com.dio.desafio.dominio;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando o bootcamp da plataforma
        Bootcamp bootcamp = new Bootcamp<>(
                "Front-end Developer",
                "Nesse bootcamp o dev desenvolverá as habilidades básicas " +
                        "para se tornar um Front-end Developer."
        );

        // mostrando o bootcamp (aqui posteriormente teremos um loop-for
        System.out.println("Bootcamp(s) à disposição na plataforma:");
        System.out.println("Nome: " + bootcamp.getNome());
        System.out.println("descrição: " + bootcamp.getDescrição());

        // criando os cursos desse bootcamp
        Curso html5 = new Curso(
                "HTML básico",
                "Esse curso ensina o dev a escrever páginas HTML 5 para um " +
                        "website que aparece no navegador.",
                12
        );
        Curso css3 = new Curso(
                "CSS3 básico",
                "Esse curso ensina o dev a escrever folhas de estilo para um " +
                        "website.",
                18
        );
        Curso javascript = new Curso(
                "javaScript básico",
                "Esse curso ensina o dev a escrever usando a linguagem JavaScript " +
                        "para dar mais vida e movimento à seu website.",
                20
        );

        // detalha cursos do bootcamp (posteriormente um loop-for)
        System.out.println("...com os cursos...");
        System.out.println("1. Título....: " + html5.getTitulo());
        System.out.println("   Descrição.: " + html5.getDescricao());
        System.out.println("2. Nome......: " + css3.getTitulo());
        System.out.println("   Descrição.: " + css3.getDescricao());
        System.out.println("3. Nome......: " + javascript.getTitulo());
        System.out.println("   Descrição.: " + javascript.getDescricao());

        // criando uma mentoria para o bootcamp
        Mentoria mentoria = new Mentoria(
                "Mentoria Dev front-end",
                "Essa mentoria coloca o dev em contato com especialistas que darão " +
                        "preciosas dicas para turbinar o aprendizado."
        );
        System.out.println("... e mentoria marcada para " + mentoria.getData() + ".");
        System.out.println("   Título....: " + mentoria.getTitulo());
        System.out.println("   Descrição.: " + mentoria.getDescricao());

        // incluindo os conteúdos no bootcamp
        bootcamp.getConteudos().add(html5);
        bootcamp.getConteudos().add(css3);
        bootcamp.getConteudos().add(javascript);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria);

        // incluindo dev no bootcamp
        System.out.print("Olá dev! Qual é seu nome?: ");
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        Dev dev = new Dev(nome);
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Você está inscrito em:\n" + bootcamp);

        // fazendo atividades
        while (!dev.getConteudosInscritos().isEmpty()) {
            System.out.println("Você tem " + dev.getConteudosInscritos().size() +
                    " atividades para concluir o bootcamp.");
            System.out.println("As atividades são:");
            for (Conteudo conteudo : dev.getConteudosInscritos()) {
                System.out.println(conteudo.getTitulo());
            }
            System.out.print("Fazer próxima atividade? [s/n/c]: ");
            char c = s.nextLine().toLowerCase(Locale.ROOT).charAt(0);
            if ( c == 's') {
                dev.progredir();
            } else if (c == 'n') {
                continue;
            } else if (c == 'c') {
                break;
            }
        }

        // despedida
        if (dev.getConteudosInscritos().size() == 0) {
            System.out.println("Parabéns! Você terminou o bootcamp!");
            System.out.println("-------------------------------------------");
            System.out.println("                CERTIFICADO");
            System.out.println("  Certificamos que " + dev.getNome().toUpperCase());
            System.out.println("  em " + bootcamp.getDataFinal());
            System.out.println("  concluiu o bootcamp " + bootcamp.getNome());
            System.out.println("  com carga horária de 50 horas.");
            System.out.println("-------------------------------------------");
        }
        System.out.println("obrigado por acessar a plataforma!");
        System.out.println("Continue a aprender... sempre!");
        s.close();

    }

}

