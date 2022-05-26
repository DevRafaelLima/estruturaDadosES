package listaII.atividade2;

public interface ILista {
    public void insereInicio(Object obj);
    public void insereFim(Object obj);
    public boolean estahVazia(Object obj);
    public boolean remova(Object obj);
    public int tamanho();
    public void impressaoInicio();
    public void impressaoFim();
    public Noh buscar(Object obj);
}
