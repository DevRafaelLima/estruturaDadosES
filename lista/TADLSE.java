package lista;

public class TADLSE implements ILista{
    private Object inicio;

    public TADLSE(){
        this.inicio = null;
    }

    public void insertInicio(Object aluno) {
        Aluno novo = (Aluno) aluno;

        if(this.inicio == aluno){
            this.inicio = (Aluno) aluno;
        } else {
            novo.setProxEnd((Aluno) this.inicio);
            this.inicio = novo;
        }        
    }

    @Override
    public void insertFim(Object aluno) {
        Aluno novo = (Aluno) aluno;

        if(this.inicio == null){
            this.inicio = novo;
        } else {
            Aluno alunoUltimo = null;
            for(Aluno i = (Aluno) this.inicio; i != null; i = i.getProxEnd()){
                alunoUltimo = i;
            }
            alunoUltimo.setProxEnd(novo);
        }
        
    }

    @Override
    public boolean estahVazia() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(Object aluno) {
        Aluno ant = null, p;
        p = (Aluno) this.inicio;
        while(p != null && p.getProxEnd() != aluno){
            ant = p;
            p = p.getProxEnd();
        } 

        if(p == null){
            return false;
        } 
        if(ant == null){
            inicio = p.getProxEnd();
        } else {
            ant.setProxEnd(p.getProxEnd());
            return true;
        }
        return false;
    }

    @Override
    public int tamanho() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
