package aula1_9289;

import java.util.Scanner;

public class Aula1_9289 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Ola, bem vindo!");
        int matricula;
        float nota;
        String nome;
        matricula = 9289;
        nota = 60.1f;
        nome = "antonio";

        System.out.printf("%s sua matricula é %d e sua nota é %.2f", nome, matricula, nota);

        System.out.println("Entre com seu nome:");
        nome = ler.next();
        System.out.println("Entre com sua matricula:");
        matricula = ler.nextInt();
        System.out.println("Entre com a nota");
        nota = ler.nextFloat();
        System.out.printf("%s sua matricula é %d e sua nota é %.2f", nome, matricula, nota);
    }
}
