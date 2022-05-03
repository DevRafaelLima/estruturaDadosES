package arranjo;

class Arranjo{

    public static void main(String[] args){
        Aluno a1 = new Aluno("Rafael santos", 24, 10);
        Aluno a2 = new Aluno("Maria", 14, 8);
        Aluno a3 = new Aluno("João", 15, 3);
        Aluno a4 = new Aluno("Telma", 12, 6);
        TAD tad = new TAD();
        //adiciona ao TAD
        tad.add(a1);
        tad.add(a2);
        tad.add(a3);
        //verifica o tamanho do TAD
        System.out.println(tad.tamanho());

        //verica se contem
        System.out.println(tad.contem(a1));
        System.out.println(tad.contem(a4));
    }

}
