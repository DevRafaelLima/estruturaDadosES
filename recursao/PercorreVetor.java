package recursao;

public class PercorreVetor {
    
    public int percorreRec(int[] array, int init, int end){
        if(init == end){
            return array[init];
        } else {
            int meio = (init + end ) / 2;
            int max1 = percorreRec(array, init, meio);
            int max2 = percorreRec(array, (meio + 1), end);

            if(max1 > max2){
                return max1;
            } else {
                return max2;
            }
        }
    }

    public int percorreIte(int[] array){
        int aux = array[array.length - 1];
        for(int i = 0; i<array.length; i++){
            if(aux < array[i]){
                aux = array[i];
            }
        }
        
        return aux;

    }
}
