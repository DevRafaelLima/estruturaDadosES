package App;

public class Main {
	public static void aula17() {
		FilaVet f = new FilaVet(10);
		f.add(10);
		f.add(15);
		f.add(120);
		f.add(111);
		f.add(19);
		f.add(12);
		f.add(1);
		f.add(10);
		f.add(10);
		f.add(10);
		f.remove();
		f.remove();
		f.remove();
		f.remove();
		f.imprimir();
	}
	public static void atividade10() {
		//Vetor que recebe os alunos	
		FilaVet alunos = new FilaVet(5);
		
		//alunos a serem atendidos
		Aluno n1 = new Aluno("Aluno1", "Masc");
		Aluno n2 = new Aluno("Aluno2", "Masc");
		Aluno n3 = new Aluno("Aluno3", "Fem");
		Aluno n4 = new Aluno("Aluno4", "Fem");
		Aluno n5 = new Aluno("Aluno5", "Masc");
		Aluno n6 = new Aluno("Aluno6", "Masc");
		Aluno n7 = new Aluno("Aluno7", "Fem");
		Aluno n8 = new Aluno("Aluno8", "Masc");
		//adicionar os alunos na estrutura de dados
		alunos.add(n1);
		alunos.add(n2);
		alunos.add(n3);
		alunos.add(n4);
		alunos.add(n5);
		alunos.imprimir();
		System.out.println("");
		//adicionar mais um aluno vai dá erro
//		alunos.add(n6);
		//então tem que remover um aluno
		alunos.remove();
		System.out.println(alunos.add(n6));
		alunos.imprimir();
//		alunos.imprimir();
		
	}
	public static void aula18() {
		FilaLista filaII = new FilaLista();
		Aluno a1 = new Aluno("Aluno1", "Masc");
		Aluno a2 = new Aluno("Aluno2", "Masc");
		Aluno a3 = new Aluno("Aluno3", "Fem");
		Aluno a4 = new Aluno("Aluno4", "Fem");
		Aluno a5 = new Aluno("Aluno5", "Masc");
		Aluno a6 = new Aluno("Aluno6", "Masc");
		Aluno a7 = new Aluno("Aluno7", "Fem");
		Aluno a8 = new Aluno("Aluno8", "Masc");
		filaII.add(a1);
		filaII.add(a2);
		filaII.add(a3);
		filaII.add(a4);
		filaII.add(a5);
		filaII.add(a6);
		filaII.add(a7);
		filaII.add(a8);
		filaII.remove();
		filaII.remove();
		System.out.println("tamanho" + filaII.size());
		filaII.imprimir();
	}
	public static void main(String[] args) {
		aula17();
		atividade10();
//		aula18();
	}
}
