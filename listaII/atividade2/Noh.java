package listaII.atividade2;

public class Noh {
    private Object obj;
    private Noh ant;
    private Noh prox;

    public Noh(Object obj){
        this.obj = obj;
        this.ant = null;
        this.prox = null;
    }
    public Object getInfo(){
        return this.obj;
    }

    public Object getObj() {
        return obj;
    }

    public Noh getAnt() {
        return ant;
    }

    public void setAnt(Noh ant) {
        this.ant = ant;
    }

    public Noh getProx() {
        return prox;
    }

    public void setProx(Noh prox) {
        this.prox = prox;
    }
}
