package classeexecutavel;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Endereco;
import model.Faculdade;
import model.Nota;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
			long tel = Long.parseLong(JOptionPane.showInputDialog("Telefone da Faculdade: "));
			String email = JOptionPane.showInputDialog("E-mail da Faculdade: ");
			
			String nomeRua = JOptionPane.showInputDialog("Nome da rua da Faculdade: ");
			int numeroRua = Integer.parseInt(JOptionPane.showInputDialog("Número da Faculdade: "));
			String bairro = JOptionPane.showInputDialog("Bairro da Faculdade: ");
			String cidade = JOptionPane.showInputDialog("Cidade da Faculdade: ");
			String uf = JOptionPane.showInputDialog("UF da Faculdade: ");
			String complemento = JOptionPane.showInputDialog("Complemento da Faculdade: ");
			long cep = Long.parseLong(JOptionPane.showInputDialog("CEP da Faculdade: "));
			
			Endereco enderecoFaculdade = new Endereco(nomeRua, numeroRua, bairro, cidade, uf, complemento, cep);
			
			String nomeCurso = JOptionPane.showInputDialog("Nome do Curso: ");
			String codigoCurso = JOptionPane.showInputDialog("Código do Curso: ");
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina: ");
			String codigoDisciplina = JOptionPane.showInputDialog("Código da Disciplina: ");
			
			String nomeAluno = JOptionPane.showInputDialog("Nome do Aluno: ");
			//Int tem um espeço menor alocado que long, se quiser trocar o tipo para poder armazenar mais dados pode fazer
			int cpfAluno = Integer.parseInt(JOptionPane.showInputDialog("CPF do Aluno: "));
			String matriculaAluno = JOptionPane.showInputDialog("Matricula do Aluno: ");
			
			nomeRua = JOptionPane.showInputDialog("Nome da rua do Aluno: ");
			numeroRua = Integer.parseInt(JOptionPane.showInputDialog("Número do endereço do Aluno: "));
			bairro = JOptionPane.showInputDialog("Bairro do Aluno: ");
			cidade = JOptionPane.showInputDialog("Cidade do Aluno: ");
			uf = JOptionPane.showInputDialog("UF do Aluno: ");
			complemento = JOptionPane.showInputDialog("Complemento do endereço do Aluno: ");
			cep = Long.parseLong(JOptionPane.showInputDialog("CEP do Aluno: "));
			
			Endereco enderecoAluno = new Endereco(nomeRua, numeroRua, bairro, cidade, uf, complemento, cep);
			
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("1º Nota: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("2º Nota: "));
			float nota3 = Float.parseFloat(JOptionPane.showInputDialog("3º Nota: "));
			
			Nota notaAluno = new Nota(nota1, nota2, nota3);
			
			Aluno aluno = new Aluno(nomeAluno, cpfAluno, matriculaAluno, enderecoAluno, notaAluno);

			Disciplina disciplina = new Disciplina(nomeDisciplina, codigoDisciplina, aluno);

			Curso curso = new Curso(nomeCurso, codigoCurso, disciplina);

			Faculdade faculdade = new Faculdade(tel, email, enderecoFaculdade, curso);

			System.out.println("-----------------------------------");
			System.out.println("Informacoes da Faculdade: ");
			System.out.println("-----------------------------------");
			System.out.println("Telefone: "+faculdade.getTelefone());
			System.out.println("Email: "+faculdade.getEmail());
			System.out.println("Rua: "+faculdade.getEndereco().getNomeRua());
			System.out.println("Numero: "+faculdade.getEndereco().getNumero());
			System.out.println("Bairro: "+faculdade.getEndereco().getBairro());
			System.out.println("Cidade: "+faculdade.getEndereco().getCidade());
			System.out.println("Uf: "+faculdade.getEndereco().getUf());
			System.out.println("Complemento: "+faculdade.getEndereco().getComplemento());
			System.out.println("Cep: "+faculdade.getEndereco().getCep());
			System.out.println("-----------------------------------");
			System.out.println("Informacoes do Curso: ");
			System.out.println("-----------------------------------");
			System.out.println("Nome: "+faculdade.getCurso().getNome());
			System.out.println("Codigo: "+faculdade.getCurso().getCodigo());
			System.out.println("-----------------------------------");
			System.out.println("Informacoes da Disciplina: ");
			System.out.println("-----------------------------------");
			System.out.println("Disciplina: "+faculdade.getCurso().getDisciplina().getNome());
			System.out.println("Disciplina: "+faculdade.getCurso().getDisciplina().getCodigo());
			System.out.println("-----------------------------------");
			System.out.println("Informacoes do Aluno: ");
			System.out.println("-----------------------------------");
			System.out.println("Endereco do Aluno: ");		
			System.out.println("Rua: "+faculdade.getCurso().getDisciplina().getAluno().getEndereco().getNomeRua());
			System.out.println("Numero: "+faculdade.getCurso().getDisciplina().getAluno().getEndereco().getNumero());
			System.out.println("Bairro: "+faculdade.getCurso().getDisciplina().getAluno().getEndereco().getBairro());
			System.out.println("Cidade: "+faculdade.getCurso().getDisciplina().getAluno().getEndereco().getCidade());
			System.out.println("Uf: "+faculdade.getCurso().getDisciplina().getAluno().getEndereco().getUf());
			System.out.println("Complemento: "+faculdade.getCurso().getDisciplina().getAluno().getEndereco().getComplemento());
			System.out.println("Cep: "+faculdade.getCurso().getDisciplina().getAluno().getEndereco().getCep());
			System.out.println("Dados do Aluno: ");
			System.out.println("Nome: "+faculdade.getCurso().getDisciplina().getAluno().getNome());
			System.out.println("Matricula: "+faculdade.getCurso().getDisciplina().getAluno().getMatricula());
			System.out.println("Cpf: "+faculdade.getCurso().getDisciplina().getAluno().getCpf());
			System.out.println("Nota 1: "+faculdade.getCurso().getDisciplina().getAluno().getNota().getNota1());
			System.out.println("Nota 2 : "+faculdade.getCurso().getDisciplina().getAluno().getNota().getNota2());
			System.out.println("Nota 3: "+faculdade.getCurso().getDisciplina().getAluno().getNota().getNota3());
			System.out.println("Media: "+faculdade.getCurso().getDisciplina().getAluno().getNota().calcularMedia());	
			System.out.println("Situacao: "+faculdade.getCurso().getDisciplina().getAluno().mostrarSituacao(faculdade.getCurso().getDisciplina().getAluno().getNota().verificarSituacao()));	

	}

}
