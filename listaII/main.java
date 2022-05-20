package listaII;

import listaII.atividada1.LDE;

class main{
    public static void main(String[] args){
        LDE l = new LDE();

        l.insereInicio(10);
        l.insereFim(5);
        l.insereInicio(51);
        l.insereInicio(2);
        l.insereInicio(35);
        l.insereInicio(100);
        l.insereInicio(125);

        // System.out.println(l.remove(51));
        l.impressaoInicio();
        System.out.println("Impressão fim");
        l.impressaoFim();
        System.out.println("Remover 125: " + l.remove(125));
    }
}