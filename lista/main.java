package lista;

public class main {
    public static void main(String[] arg){
        Aluno a1 = new Aluno("Rafael santos", 24, 10);
        Aluno a2 = new Aluno("Aluno 1", 12, 5);
        Aluno a3 = new Aluno("Aluno 2", 14, 5);
       
        TADLSE list = new TADLSE();
        list.insertInicio(a1);
        list.insertInicio(a2);
        list.insertFim(a3);

        System.out.println(list.remove(a3));

        System.out.println("compilou");
    }
}
