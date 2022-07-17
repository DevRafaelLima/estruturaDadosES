package app;

public class PilhaVet implements IPilha{
	private Object[] pilha;
	private int numElem;
	
	public PilhaVet(int tamanhoVet) {
		this.pilha = new Object[tamanhoVet];
		this.numElem = 0;
	}
	@Override
	public boolean Push(Object info) { //empilha
		if (this.numElem == pilha.length){
			System.out.println("pilha estourou");
			return false;
		}
			this.pilha[this.numElem] = info;
			++this.numElem;
			return true;
	}

	@Override
	public Object Pop() { // desempilha
		Object o = null;
		if(this.isEmpty()){
		System.out.println("Pilha vazia");
		return null;
		}
		o = this.pilha[this.numElem - 1];
		this.pilha[this.numElem - 1] = null;
		this.numElem--;
		return o;
	}

	@Override
	public Object top() {
		return this.pilha[this.numElem];
	}

	@Override
	public boolean isEmpty() {
		if(numElem == 0)
			return  true;
		return false;
	}

	@Override
	public int size() {
		return this.numElem;
	}
	public void imprimir() {
		for(int i = numElem-1; i >= 0; i--)
			System.out.println(this.pilha[i]);
	}

}
