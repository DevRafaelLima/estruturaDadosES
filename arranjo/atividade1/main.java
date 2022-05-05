package arranjo.atividade1;

class main {
    public static void main(String[] args){
        PontoCartesiano p1 = new PontoCartesiano(1, 1);
        PontoCartesiano p2 = new PontoCartesiano(1, 4);

        TAD tad = new TAD(p1, p2);

        tad.distancia();
    }
}
