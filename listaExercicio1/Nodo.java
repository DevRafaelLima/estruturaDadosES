package listaExercicio1;

public class Nodo {
    private Nodo anterior;
    private Nodo proximo;
    private String valor;
    //Define valor do nó
    public void setValor(String valor){
        this.valor = valor;
    }
    //Retorna valor do nó
    public String getValor(){
        return valor;
    }
    //Define nó anterior
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    //Retorna o nó anterior
    public Nodo getAnterior(){
        return anterior;
    }
    //Define o próximo nó
    public void setProximo(Nodo proximo){
        this.proximo = proximo;
    }
    //Retorna proximo nó
    public Nodo getProximo(){
        return proximo;
    }

}
