package listaExercicio1;

import java.util.Scanner;

public class Main{
    public static void q1(){
        Scanner sc = new Scanner(System.in);
        int [] v1 = {10,56,6,8,7,9,100,48,3,15};
        int [] v2 = {10,56,6,7,8,96,12,34,5,99};
        int tamanhoInteseccao = 0;
        

        for(int i = 0; i < v1.length; i++){
            for(int j = 0; j<v2.length;j++){
                 if(v1[i] == v2[j]){
                    tamanhoInteseccao ++;
                 }
            }
        }
        int [] vetInteseccao = new int[tamanhoInteseccao];
        for(int i = 0; i < v1.length; i++){
            for(int j = 0; j<v2.length;j++){
                 if(v1[i] == v2[j]){
                    vetInteseccao[tamanhoInteseccao - 1] = v1[i];
                    tamanhoInteseccao --;
                 }
            }
        }

        for(int i = 0; i < vetInteseccao.length; i++){
            System.out.println(vetInteseccao[i]);
        }
      


        sc.close();
    }
    public static void main(String [] args){
        q1();
    }
}