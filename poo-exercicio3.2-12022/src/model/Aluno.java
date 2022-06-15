package model;

public class Aluno {
	private String nome;
	private int cpf;
	private String matricula;
	private Endereco endereco;
	private Nota nota;

	public Aluno() {

	}

	public Aluno(String nome, int cpf, String matricula, Endereco endereco, Nota nota) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereco = endereco;
		this.nota = nota;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	public String mostrarSituacao(boolean situacao) {
		if (situacao == true) {
			return ("APROVADO");
		} else {
			return ("REPROVADO");
		}

	
	}
}
