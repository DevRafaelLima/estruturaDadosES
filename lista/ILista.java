package lista;

public interface ILista {
    public void insertInicio(Object aluno);
    public void insertFim(Object aluno);
    public boolean estahVazia();
    public boolean remove(Object aluno);
    public int tamanho();
}
