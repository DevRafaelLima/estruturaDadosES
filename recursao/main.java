package recursao;

import java.security.GeneralSecurityException;
import java.util.Random;
import java.util.Scanner;

import arranjo.TAD;

public class main {
    
    public static void calcFatorial(){
        PercorreVetor pv = new PercorreVetor();
        Scanner sc = new Scanner(System.in);

        int [] array = new int[3];
        array[0] = 20;
        array[1] = 3;
        array[2] = 50;
        

        System.out.println("Opções: ");
        System.out.println("Calcular fatorial [1]");
        System.out.println("Calcular fibonacci [2]");
        System.out.println("Encontrar o maior elemento de um vetor com recursão [3]");
        System.out.println("Encontrar o maior elemento de um vetor com interação [4]");
        System.out.println("Atividade de recursão proposta na aula [5]");

        char opt = sc.nextLine().charAt(0);

        switch(opt){
            case '1':
                System.out.println("Infome um valor inteiro para ser calculado o fatorial");
                int nFat = Integer.parseInt(sc.nextLine());
                int result = exerWithRecursion.factorial(nFat);
                System.out.println(result);
                break;
            case '2':
                System.out.println("Informe um número para calcular fibonacci");
                int nFib = Integer.parseInt(sc.nextLine());
                System.out.println(exerWithRecursion.fibonacci(nFib));
                break;
            case '3':
                System.out.println(pv.percorreRec(array, 0, 2));
                break;
            case '4': 
                System.out.println(pv.percorreIte(array));   
                break;
            case '5':
                System.out.println(pv.percorreRec(array, 0, 2));
                break;
            default: 
                System.out.println("Valor incorreto");
                break;
        }
        sc.close();
    }

    public static void main(String[] args){
        calcFatorial();

        // System.out.println(3/2);
    }
}
