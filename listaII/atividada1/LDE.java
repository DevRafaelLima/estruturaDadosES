package listaII.atividada1;

import java.text.BreakIterator;

public class LDE implements ILista{
    private Noh inicio;
    private Noh fim;

    public LDE(){
        this.inicio = null;
        this.fim = null;
    }
    @Override
    public void insereInicio(int info) {
        Noh novo = new Noh(info);

        if(inicio == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
        
    }

    @Override
    public void insereFim(int info) {
        Noh novo = new Noh(info);
        if(fim == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }

    }

    @Override
    public boolean estahVazia() {
        // TODO Auto-generated method stub
        return false;
    }
    
    public Noh busca(int info){
        Noh p = inicio;

        while(p != null && p.getInfo() != info){
            p = p.getProx();
        }
        return p;
    }
    @Override
    public boolean remove(int info) {
        Noh p = busca(info);

        if(p == null){
            return false;
        }

        if(p.getAnt() == null){
            inicio = p.getProx();
            inicio.setAnt(null);
        } else if(p.getProx() == null){
            p.getAnt().setProx(null);
            fim = p.getAnt();
        }else {
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
    public void impressaoInicio() 
    {   
        Noh auxiliar = this.inicio;
        while(auxiliar != null){
            System.out.println(auxiliar.getInfo());
            auxiliar = auxiliar.getProx();
        }    
    }
    public void impressaoFim(){
        Noh auxiliar = this.fim;
        while(auxiliar != null){
            System.out.println(auxiliar.getInfo() );
            auxiliar = auxiliar.getAnt();
        }
    }
    
}
