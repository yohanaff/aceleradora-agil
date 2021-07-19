// ==========================================
// Exercício de programação - 2021/2
// ==========================================
// ENUNCIADO 1


package com.biblioteca;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {


        //Isso aqui tá feio demais, confesso que a ideia era deixar limpo, mas não consegui ainda
        String id01 = "00001";
        String book01 = "Como fazer sentido e bater o martelo";
        String author01 = "Autor: Alexandro Aolchique";
        String year01 = "Ano: 2017";

        String id02 = "00002";
        String book02 =  "Código Limpo";
        String author02 = "Tio Bob";
        String year02 = "Ano: 2001";

        String id03 = "00003";
        String book03 = "Basquete 101";
        String author03 = "Hortência Marcari";
        String year03 = "Ano: 2010";




        Scanner sc = new Scanner(System.in);
        System.out.println("Para acessar a biblioteca, digite o seu nome completo:");
        String name = sc.nextLine();

        System.out.println("Livros disponíveis para retirar:\n\n");
        System.out.println(id01 + " - " + book01 + " - " + author01 + " - " + year01 + "\n");
        System.out.println(id02 + " - " + book02 + " - " + author02 + " - " + year02 + "\n");
        System.out.println(id03 + " - " + book03 + " - " + author03 + " - " + year03 + "\n");

        while(true) {
            System.out.println("=======================================================\n");
            System.out.println("Selecione uma das opções:\n");
            System.out.println("1 - Retirar livro\n");
            System.out.println("2 - Devolver livro\n");
            System.out.println("3 - Doar livro\n");
            System.out.println("4 - Sair\n");
            int decision = sc.nextInt();

            if (decision == 1) {
                System.out.println("Digite o código do livro que você deseja RETIRAR (ex: 00007):\n");
                int id = sc.nextInt();
                System.out.println("Livro retirado com sucesso! Você escolheu o livro:\n");
                System.out.println("Código: 0000" + id +"\n");
                //Aqui a ideia era mostrar o nome, autor e ano também, mas não deu tempo de terminar huahsuhaushsau

            } else if (decision == 2) {
                System.out.println("\"Digite o código do livro que você deseja DEVOLVER (ex: 00007):\n");
                int id = sc.nextInt();
                System.out.println("Você devolveu o livro de código 0000" + id);

            } else if (decision == 3) {
                System.out.println("Digite o código do livro que você deseja DOAR (ex: 00007):\n");
                int id = sc.nextInt();
                System.out.println("Livro 0000" + id + "doado com sucesso!");
                //Aqui era para o programa coletar os dados de quem emprestou, do nome do livro, autor e ano, e em seguida armazenar esses dados
                //Seria melhor ter feito um banco de dados mesmo

            } else if (decision == 4) {
                System.out.println("Você saiu da biblioteca");

            } else {
                System.out.println("Erro! Digite um número entre 1 e 4!\n");
            }
        }
    }
}
