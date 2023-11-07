package Questao_01;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.inforFuncionario("Scarllet", "12345678910", "09/10/2000", "00987654", 1500, "Diretora", "Valenda");
		
		Funcionario f2 = new Funcionario();
		f2.inforFuncionario("Tella", "09876543211", "10/04/2002", "8856432167", 1800, "CEO", "Valenda");
		
		Funcionario f3 = new Funcionario();
		f3.inforFuncionario("Julian", "21435465768", "20/11/2001", "1156932509", 1300, "Sócio", "Cidade do Norte");
		
		Empresa e1 = new Empresa();
		e1.addEmpresa("Caraval", "12345", "Velaris", "CE");
		e1.addFunc(f1);
		e1.addFunc(f2);
		e1.addFunc(f3);
		
		e1.mostrarFuncionariosEempresa();
		
		Funcionario f4 = new Funcionario();
		f4.inforFuncionario("Julian", "21435465768", "20/11/2001", "1156932509", 1300, "Sócio", "Cidade do Norte");
		System.out.print("\n");
		System.out.println(e1.verificarFuncionario(f4));
	}
}
