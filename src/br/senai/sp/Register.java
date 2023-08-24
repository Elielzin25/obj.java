package br.senai.sp;

import java.util.Scanner;

public class Register {
    void register(){
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

    void prof(){
        /** instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        /** instancia Professor */
        Professor objProfessor = new Professor();

        System.out.println("Qual o seu nome:");
        objProfessor.nome = teclado.next();
        System.out.println("O seu nome e:" + objProfessor.nome);
        System.out.println("qual e sua idade");
        objProfessor.idade = teclado.nextInt();
        System.out.println("a sua idade e " + objProfessor.idade);
        System.out.println("qual e sua disciplina");
        objProfessor.disiciplina = teclado.next();
        System.out.println("sua disciplina e " +objProfessor.disiciplina ) ;
        System.out.println("qual e o seu telefone");
        objProfessor.telefone = teclado.nextInt();
        System.out.println(" o seu telefone e" +objProfessor.telefone);
        System.out.println("fim dos dados ");

    }
    void register2(){
        this.prof();
        this.register();
    }
}
