package arranjo;

public class TAD {
    private Aluno[] a = new Aluno[5];
    private int acumulador = 0;

    public void add(Aluno a){
        this.a[this.acumulador] = a;
        this.acumulador++;
    }
    public int tamanho(){
        return this.acumulador;
    }
    public boolean contem(Aluno aluno){
        for(int i = 0; i <  this.a.length; i++){
            if(this.a[i] == aluno){
                return true;
            }
        }
        return false;
    }

}
