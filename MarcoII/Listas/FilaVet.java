package App;


public class FilaVet implements IFila{ // tem funcionamento cricular
	private int nElemFila;
	private int inicio;
	private Object[] vetFila;
	
	public FilaVet(int tamFila) {
		this.nElemFila = 0;
		this.inicio = 0;
		this.vetFila = new Object[tamFila];
	}
	
	public boolean add(Object info) {
		if (this.nElemFila == vetFila.length) {
			System.out.println("Capacidade da fila esgotou");
			return false;
		}
			int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
			this.vetFila[fim] = info;
			this.nElemFila++;
			return true;
	}


	public boolean remove() {
		if (this.isEmpty()){ //como verificar se está vazia?
			System.out.println("Fila estah vazia");
			return false;
		}
			this.inicio = (this.inicio + 1) % this.vetFila.length;
			this.nElemFila--;
			return true;
	}

	
	public boolean isEmpty() {
		if(nElemFila == 0 && inicio == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return nElemFila;
	}

	public void imprimir() {
		if(isEmpty()) {
			System.out.println("lista vazia!");
		} else {
			for(int i = 0; i<nElemFila; i++) {
				System.out.println(vetFila[i].toString());
			}						
		}	
	}
}
