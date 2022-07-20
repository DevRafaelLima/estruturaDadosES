package main.hashImplementacao;

import main.entities.Aluno;

public class MapaHashVetor {
	private Aluno[] vetor;
	
	public MapaHashVetor() {
		this.vetor = new Aluno[17];
	}
	private int hash(int chave) {
		return chave % vetor.length;
	}
	public Aluno get(int chave) {
		int sondagem = 0;
		int hash;
		while(sondagem < vetor.length) {
			hash = (hash(chave)+sondagem)%vetor.length;
			if(vetor[hash].getMatricula() == chave) {
				return vetor[hash];
			}
		}
		return null;
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
		int sondagem = 0;
		int hash;
		while(sondagem < vetor.length) {
			hash = (hash(chave)+sondagem)%vetor.length;
			if(vetor[hash].getMatricula() == chave) {
				Aluno aluno = vetor[hash];
				vetor[hash] = null;
				return aluno;
			}
		}
		return null;
	}
	
	public void resize() {
		
	}
	public void rehash() {
		
	}
}
