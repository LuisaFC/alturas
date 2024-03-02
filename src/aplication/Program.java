package aplication;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas?");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for(int i = 0; i < vect.length; i++ ){
            System.out.printf("Dados da %da pessoa: ", i+1);
            System.out.println("\nNome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        double sum = 0.00;
        for(int i = 0; i < vect.length; i++ ){
            sum += vect[i].getAltura();
        }

        double avg = sum/vect.length;

        int menores = 0 ;

        for(int i = 0; i < vect.length; i++ ){
           if(vect[i].getIdade() < 16){
               menores++;
           }
        }

        double percenturalMenores = ((double)menores / n) * 100.0;

        System.out.printf("Altura media: %.2f", avg);
        System.out.println("\nPessoas com menos de 16 anos: " + percenturalMenores + "%");

        for(int i = 0; i < vect.length; i++ ){
            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
