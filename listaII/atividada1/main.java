package listaII.atividada1;

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
        System.out.println("Remover 1256.1 - Implemente um TAD LDE que armazena inteiros. Em seguida, refatore o método remove() de modo que a busca ocorra em outro método e seu retorno seja utilizado no método remove();  Implemente o método de impressão de modo que seja possível escrever os inteiros em ambos os sentidos.: " + l.remove(125));
    }
}