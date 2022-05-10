package arranjo;

public interface Ivetor {
    public int tamanho();
    public void add(Object aluno);
    public boolean contem(Object aluno);
    public boolean remove(Object aluno);
    public void garanteEspaco();
    public boolean cheio();
}
