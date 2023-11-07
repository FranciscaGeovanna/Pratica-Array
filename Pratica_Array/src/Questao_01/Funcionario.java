package Questao_01;

public class Funcionario {
	String nome;
	String CPF;
	String dataNasc;
	String telefone;
	double salario;
	String cargo;
	String endereco;
	
	public void inforFuncionario(String nome, String CPF, String dataNasc, String telefone, double salario, String cargo, String endereco) {
		this.nome = nome;
		this.CPF = CPF;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.salario = salario;
		this.cargo = cargo;
		this.endereco = endereco;
	}
}
