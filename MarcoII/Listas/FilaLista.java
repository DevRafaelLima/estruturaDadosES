package App;

public class FilaLista implements IFila{
	private Noh inicio;
	private Noh fim;
	private int elementos = 0;
	
	public FilaLista (){ //construtor
		this.inicio = null;
		this.fim = null;
	}
	public boolean add(Object info) {
		Noh novo = new Noh(info);
		if (this.isEmpty()) {
			inicio = novo;
		} else {
			fim.setProx(novo);
		}
		fim = novo;
		elementos++;
		return true;
	}
	public boolean remove() {
		if (!isEmpty()){
			if (inicio == fim) {
			inicio = null;
			fim = null;
		} else
			inicio = inicio.getProx();
			elementos--;
			return true;
		}
			return false;
	}
	public boolean isEmpty() {
		if(inicio == null)
			return true;
		return false;
	}
	public int size() {
		return elementos;
	}
	public void imprimir() {
		 Noh auxiliar = this.inicio;
	     while(auxiliar != null){
	        System.out.println(auxiliar.getInfo());
	        auxiliar = auxiliar.getProx();
	    }  
	}

}
