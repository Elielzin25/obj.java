package br.senai.sp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Register OBJ = new Register();



        Scanner batata = new Scanner(System.in);
        System.out.println(" quem vc pretende cadastrar");
        String resposta = batata.next();

        if (resposta.equals("aluno")){
            OBJ.register();
        }

        else if (resposta.equals("ambos")) {
            OBJ.register2();
        } else if(resposta.equals("professor")){
            OBJ.prof();
        }else {
            System.out.println("escolha invalida");
        }
    }
}