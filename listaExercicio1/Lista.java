package listaExercicio1;
import listaExercicio1.Nodo;
import java.util.ArrayList;

public class Lista {
    private Nodo primeiro = null, ultimo = null;

    //Define nó como primeiro da lista
    public void setPrimeiro(Nodo primeiro){
        this.primeiro = primeiro;
    }
     //Retorna o primeiro nó da lista.
    public Nodo getPrimeiro() {
        return primeiro;
    }
    //Define nó como ultimo da lista.
    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    //Retorna ultimo nó da lista.
    public Nodo getUltimo() {
        return ultimo;
    }
    //Percorre os nós da lista atribuindo os valores de cada nó em um ArrayList enquanto o próximo nó não for nulo.
    public ArrayList<String> Listar() throws EmptyListException  {
        ArrayList<String> lista = new ArrayList<String>();      
        if(primeiro == null)
        throw new EmptyListException("A lista esta vazia!");      
        else{
        Nodo aux = (Nodo) getPrimeiro();      
        while(aux != null){
            String vl = ((Nodo) aux).getValor(); 
            lista.add(vl);
            aux = aux.getProximo();
        }
        return lista;
        }      
    }
    //Percorre os nós da lista comparando os valores de cada nó com o valor passado por parametro enquanto o próximo nó não for nulo.
    public boolean Procura(String valor){
        Nodo aux = getPrimeiro();      
        while(aux != null){
        if(valor.equals(aux.getValor())){
            return true;
        }
        aux = aux.getProximo();
        }
        return false;
    }
    //Insere valor passado por parametro no inicio da lista, se o valor não existir na lista.
    public void Insere_Inicio(String valor) throws ExistentValueException{      
        boolean procura = false;      
        procura = Procura(valor);      
        if (procura == false){      
        Nodo novo = new Nodo();         
        if (primeiro == null){
            novo.setValor(valor);
            setPrimeiro(novo);
            setUltimo(novo);
        }         
        else{
            primeiro.setAnterior(novo);
            novo.setValor(valor);
            novo.setProximo(primeiro);
            setPrimeiro(novo);            
        }
        }
        else{
        throw new ExistentValueException("Valor já existe na lista!");
        }
    }

}
