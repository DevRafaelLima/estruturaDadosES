package listaII.atividade2;

import arranjo.Aluno;

/*
Implemente um TAD LDE (lista duplamente encadeada) genérica com todos os métodos vistos em aula, 
utilizando como elementos objetos de Aluno. Implemente uma função de impressão que permita 
escrever os elementos do início até o fim e vice-versa! Faça testes e poste no seu repositório do 
github. Relatar suas respostas, eventuais dúvidas, descobertas, curiosidades no PIA. 
Nomeie a pasta no repositório como "Atividade 6.2".
*/
public class main {
    public static void main(String []arg){
        System.out.println("testando");
        LDE lde = new LDE();
        Aluno a1 = new Aluno("Rafael santos", 24, 10);
        Aluno a2 = new Aluno("Maria", 14, 8);
        Aluno a3 = new Aluno("João", 15, 3);
        Aluno a4 = new Aluno("Telma", 12, 6);
        Aluno a5 = new Aluno("luzia", 35, 4);
        Aluno a6 = new Aluno("Telma1", 16,6);
        Aluno a7 = new Aluno("Telma1", 21, 9);
        Aluno a8 = new Aluno("Telma1", 21, 9);

        Integer n1 = 10;
        Float f1 = 10.5f;
        lde.insereInicio(a1);
        lde.insereInicio(n1);
        lde.insereInicio(f1);
        System.out.println(lde.remova(n1));
        System.out.println(lde.buscar(n1));
    }
}
