package br.senai.sp;

import java.util.Scanner;

public class alunos2 {
    public static void main(String[] args) {
        // instanciar Scanner

        Scanner teclado = new Scanner(System.in);

        // instanciar aluno
        Aluno objaluno = new Aluno();

        System.out.println("qual o nome do aluno");
        objaluno.nome = teclado.next();
        System.out.println("o nome do aluno:" + objaluno.nome);
        System.out.println("---------------------------------");
        System.out.println("qual a idade do aluno");
        objaluno.idade = teclado.nextInt();
        System.out.println(" a idade do aluno " + objaluno.idade);
        System.out.println("-------------------------------------");
        System.out.println(" qual a sua disciplina");
        objaluno.disciplina = teclado.next();
        System.out.println("disciplina: " + objaluno.disciplina);
        System.out.println("-----------------------------------");
        System.out.println("digite sua midia1!");
        objaluno.media1 = teclado.nextInt();
        System.out.println("media do aluno" + objaluno.media2);
        System.out.println("digite a media 2");
        objaluno.media2 = teclado.nextInt();
        System.out.println(" a segunda midia do aluno e " + objaluno.media2);


    }
}