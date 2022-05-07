package arranjo;

public interface Ivetor {
    public int tamanho();
    public void add(Aluno aluno);
    public boolean contem(Aluno aluno);
    public boolean remove(Aluno aluno);
    public void garanteEspaco();
    public boolean cheio();
}
