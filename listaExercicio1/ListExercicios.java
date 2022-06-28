package listaExercicio1;

public class ListExercicios {
    private int [] v = {4,9,2,1,5};

    public void q1(){
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
      
    }
    public void q2(){
        for (int i = (v.length -1 ); i >=0; i--){
            int maior = this.posMaior(i);
            if(maior != i){
                this.troca(i, maior);
            }
        }

     
    }
    private int posMaior(int fim){
        int maior = fim;
        for(int i = fim-1; i >=0; i--){
            if(v[i] > v[maior]){
                maior = i;
            }
        }
        return maior;
    }
    private void troca (int a, int b){
        int aux;
        aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }
    public long q3(int n){
        if(n < 2){
            return n;
        } else {
            return q3(n-1) + q3(n - 2);
        }
    }
}
