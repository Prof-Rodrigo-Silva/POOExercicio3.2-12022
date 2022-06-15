package model;

public class Faculdade {
	private long telefone;
	private String email;
	private Endereco endereco;
	private Curso curso;

	public Faculdade() {

	}

	public Faculdade(long telefone, String email, Endereco endereco, Curso curso) {
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.curso = curso;

	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
