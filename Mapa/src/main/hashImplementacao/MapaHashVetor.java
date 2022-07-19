package main.hashImplementacao;

import main.entities.Aluno;

public class MapaHashVetor {
	private Aluno[] vetor;
	
	public MapaHashVetor() {
		this.vetor = new Aluno[20];
	}
	private int hash(int chave) {
		return chave % vetor.length;
	}
	public Aluno get(int chave) {
		int hash = hash(chave);
		return vetor[hash];
	}
	public void put(int chave, Aluno valor) {
		int sondagem = 0;
		int hash;
		while(sondagem < vetor.length) {
			hash = (hash(chave)+sondagem) % vetor.length;
			if(vetor[hash] == null || vetor[hash].getMatricula() == chave) {
				vetor[hash] = valor;
				return;
			}
			sondagem++;
		}
	}
	public Aluno remove(int chave) {
		int hash = hash(chave);
		Aluno aluno = vetor[hash];
		vetor[hash] = null;
		return aluno;
	}
}
