package listaII.atividade2;

public class LDE implements ILista{
    private Noh inicio;
    private Noh fim;

    public LDE(){
        this.inicio = null;
        this.fim = null;
    }
    @Override
    public void insereInicio(Object obj) {
        Noh novo = new Noh(obj);

        if(this.inicio == null){
            this.inicio = novo;
            this.fim = novo;
        } else {
            novo.setProx(this.inicio);
            this.inicio.setAnt(novo);
            this.inicio = novo;
        }
        
    }

    @Override
    public void insereFim(Object obj) {
        // TODO Auto-generated method stub
        Noh novo = new Noh(obj);
        if(this.fim == null){
            this.inicio = novo;
            this.fim = novo;
        } else {
            novo.setAnt(fim);
            this.fim.setProx(novo);
            this.fim = novo;
        }
    }

    @Override
    public boolean estahVazia(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remova(Object obj) {
        Noh p = buscar(obj);

        if(p == null){
            return true;
        }

        if(p.getAnt() == null){
            this.inicio = p.getProx();
            this.inicio.setAnt(null);
        } else if(p.getProx() == null){
            p.getAnt().setProx(null);
            this.fim = p.getAnt();
        } else {
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;
    }

    @Override
    public int tamanho() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void impressaoInicio() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void impressaoFim() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Noh buscar(Object obj) {
        Noh p = this.inicio;

        while(p != null && p.getInfo() != obj){
            p = p.getProx();
        }
        return p;
    }
    
}
