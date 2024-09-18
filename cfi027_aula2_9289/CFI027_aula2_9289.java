package cfi027_aula2_9289;

public class CFI027_aula2_9289 {

    public static void main(String[] args) {
        Alunos a = new Alunos();
        Alunos b = new Alunos();
        a.cadastrar();
        a.exibirDados();
        System.out.printf("Total %.2f", a.somar());
        System.out.printf("Media %.2f", a.media());
        System.out.printf("Situação %s", a.situacao());
        
    }
}
