package App;

public class Aluno {
	private String nome;
	private String sexo;
	
	public Aluno(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sexo=" + sexo + "]";
	}
	
}
