package app;

public class Main {

	public static void main(String[] args) {
		boolean result = true;//sempre começa com falso
		PilhaVet pilhaVet = new PilhaVet(6);
		PilhaVet aux = new PilhaVet(6);//pilha auxiliar
		//palavra a ser verificada
		String palavra = "rafael";
		String [] letras = new String[6];
		//tranformar a palavra num vetor
		letras = palavra.split("");
		//adicionar cada letra da palavra na estrutura de dados
		for(int i = 0; i < letras.length; i++) {
			pilhaVet.Push(letras[i]);
		}
		pilhaVet.imprimir();
		//desimpilhar a pilha em outra
		for(int i = 0 ; i < letras.length; i++) {
			aux.Push(pilhaVet.top());
			pilhaVet.Pop();
		}
//		System.out.println("-----------------------");
		aux.imprimir();
//		System.out.println(pilhaVet.top());
//		System.out.println(aux.top());
//		//desempilha as duas pilhas juntas e compara o seu resultados
//		for(int i = 0; i<letras.length; i++) {
//			System.out.println("pilha1: " + pilhaVet.top() + " pilha2: " + aux.top());
//			if(pilhaVet.top() != aux.top()) {
//				result = false;
//				break;
//			}
//		}
//		
//		if(result) {
//			System.out.println("É um palíndromo ");
//		} else {
//			System.out.println("Não é um palíndromo ");
//		}
		
		

	}

}