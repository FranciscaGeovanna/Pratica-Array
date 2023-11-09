package Questao_01;

import java.util.ArrayList;

public class Empresa {
	String nome;
	String cnpj;
	String cidade;
	String UF;
	ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
	
	public void addEmpresa(String nome, String cnpj, String cidade, String UF) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.cidade = cidade;
		this.UF = UF;
	}
	
	public void addFunc(Funcionario f) {
		this.funcionario.add(f);
	}

	public boolean verificarFuncionario(Funcionario f) {
		for(Funcionario x: this.funcionario) {
			if(x.CPF == f.CPF) { //VERIFICAR SE JÁ EXISTE FUNCIONÁRIO
				return true;
			}
		}
		return false;
		
		// OUTRA FORMA:
		//if(x.equals(f))
	}
	
	public void mostrarFuncionariosEempresa() {
		System.out.println("===== EMPRESA =====");
		System.out.println("Nome: " + nome + "\nCNPJ: " + cnpj + "\nCidade: " + cidade + "\nUF: " + UF);
		
		System.out.println("\n===== FUNCIONÁRIOS =====");
		for(Funcionario f: this.funcionario) {
			System.out.println("\nNome: " + f.nome + "\nSalário: " + f.salario + "\nCPF: " + f.CPF + "\nData de nascimento: " + f.dataNasc + "\nTelefone: " + f.telefone + "\nCargo: " + f.cargo + "\nEndereço: " + f.endereco);
		}
	}
}
