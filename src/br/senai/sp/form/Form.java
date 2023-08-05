package br.senai.sp.form;
import java.util.Scanner;

public class Form {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /** Formulário */
        System.out.print("Digite um Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite uma idade: ");
        int idade = teclado.nextInt();

        System.out.print("Digite o seu peso: ");
        int peso = teclado.nextInt();

        System.out.print("Digite sua Altura: ");
        float altura = teclado.nextFloat();

        System.out.print("Digite seu RG: ");
        int rg = teclado.nextInt();

        System.out.print("Digite seu CPF: ");
        long cpf = teclado.nextLong();

        System.out.print("Digite sua profissao: ");
        String profissao = teclado.next();

        System.out.print("Digite seu curso: ");
        String curso = teclado.next();

        /** Printa na Tela */
        System.out.println();
        System.out.println("******************Formulário********************");
        System.out.println();
        System.out.println("O seu nome e: " + nome);
        System.out.println("A sua idade e: " + idade );
        System.out.println("O seu peso e: " + peso);
        System.out.println("A sua altura é: " + altura);
        System.out.println( "O seu RG e: " + rg);
        System.out.println("O seu cpf é: " + cpf);
        System.out.println("A sua profissao é: " + profissao);
        System.out.println("O seu curso e: " + curso);
        System.out.println();
        System.out.println("*****************Obrigado********************");
    }
}
