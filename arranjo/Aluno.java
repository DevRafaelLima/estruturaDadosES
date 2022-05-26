package arranjo;

public class Aluno {
    private String name;
    private Integer idade;
    private float nota;

    public Aluno(String name, Integer idade, float nota){
        this.name = name;
        this.idade = idade;
        this.nota = nota;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Aluno [idade=" + idade + ", name=" + name + ", nota=" + nota + "]";
    }

    
}
