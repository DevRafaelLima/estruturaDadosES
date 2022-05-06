package arranjo;

class main{

    public static void main(String[] args){
        Aluno a1 = new Aluno("Rafael santos", 24, 10);
        Aluno a2 = new Aluno("Maria", 14, 8);
        Aluno a3 = new Aluno("João", 15, 3);
        Aluno a4 = new Aluno("Telma", 12, 6);
        Aluno a5 = new Aluno("Telma", 12, 6);
        Aluno a6 = new Aluno("Telma", 12, 6);
        Aluno a7 = new Aluno("Telma", 12, 6);
        TAD tad = new TAD();
        //adiciona ao TAD
        tad.add(a1);
        tad.add(a2);
        tad.add(a3);
        tad.add(a5);
        tad.add(a6);
        tad.add(a7);

        //verifica o tamanho do TAD
        System.out.println("Tamanho do array: "+tad.tamanho());

        //verica se contem
        System.out.println("Aluno a1 está no array: "+tad.contem(a1));
        System.out.println("Aluno a2 está no array: "+tad.contem(a4));
        System.out.println("Remover o a1 do array"+ tad.remove(a1));
    }

}
