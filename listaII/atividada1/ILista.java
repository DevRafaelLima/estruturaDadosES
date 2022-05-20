package listaII.atividada1;

public interface ILista {
    public void insereInicio(int info);
    public void insereFim(int info);
    public boolean estahVazia();
    public boolean remove(int info);
    public int tamanho();
    public void impressaoInicio();
    public void impressaoFim();
    public Noh busca(int info);
}
