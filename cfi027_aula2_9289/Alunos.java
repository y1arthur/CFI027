package cfi027_aula2_9289;

import java.util.Scanner;

public class Alunos {

    int matricula;
    String nome;
    float nota1, nota2, nota3;

    public float somar() {
        return nota1 + nota2 + nota3;
    }
    //total assume o equivalente a soma das notas
    float total = somar();

    public float media() {
        return (nota1 + nota2 + nota3) / 3;
    }
    //media assume a media das notas
    float mediarit = media();

    public String situacao() {
        if (somar() >= 60) {
            return "Aprovado";

        } else {
            return "Vai ser bom vê-lo novamente!";
        }

    }

    public void exibirDados() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Total: " + somar());
        System.out.println("Média: " + media());
    }

    public void cadastrar() {
        Scanner ler = new Scanner(System.in);
        try {
            System.out.println("Entre com sua matricula");
            matricula = ler.nextInt();
        } catch (Exception e) {
            System.out.println("Digitou valores errados");
        }
        
        ler.nextLine();
        System.out.println("Entre com seu nome");
        nome = ler.nextLine();
        System.out.println("Entre com sua primeira nota");
        nota1 = ler.nextFloat();
        System.out.println("Entre com sua segunda nota");
        nota2 = ler.nextFloat();
        System.out.println("Entre com sua terceira nota");
        nota3 = ler.nextFloat();
        
    }

}
