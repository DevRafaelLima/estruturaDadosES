package arranjo;

public class TAD{
    private Object[] aluno = new Object[5];
    private int acumulador = 0;
    public void add(Object aluno){
        this.garanteEspaco();
        this.aluno[this.acumulador] = aluno;      
        this.acumulador++;
    }
    public int tamanho(){
        return this.acumulador;
    }
    public boolean contem(Object aluno){
        for(int i = 0; i <  this.acumulador; i++){
            if(this.aluno[i] == aluno){
                return true;
            }
        }
        return false;
    }
    public boolean cheio(){
        
        if(acumulador == this.aluno.length)
            return true;
        return false;
    }
    public boolean remove(Object aluno){
        int aux = -1;
        for(int i = 0; i <this.acumulador; i++){
            if(aluno == this.aluno[i]){
                aux = i;
                break;
            }
        }
        if(aux != -1){
            for(int i = aux; i< (this.acumulador - 1); i++){
                this.aluno[i] = this.aluno[i+1];
            }
            this.acumulador --;
            return true;
        }
        return false;
    }
    public void garanteEspaco(){
        if(this.cheio()){
            Object []newArray = new Object[this.aluno.length * 2];
            for(int i = 0; i<this.aluno.length; i++){
                newArray[i] = this.aluno[i];
            }
            this.aluno = newArray;
        }
    }
   
}
