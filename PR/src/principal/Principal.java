package principal;
import modelo.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		System.out.println("Entre com o nome");
		p1.setNome(sc.nextLine()) ;
		System.out.println("Entre com o sobrenome");
		p1.setSobrenome(sc.nextLine());
		System.out.println("Nome Completo: "+p1.getNomeCompleto());
		Funcionario f1 = new Funcionario();
		System.out.println("Entre com o nome do funcionario: ");
		f1.setNome(sc.nextLine());
		System.out.println("Entre com o sobrenome do funcionario");
		f1.setSobrenome(sc.nextLine());
		System.out.println("Digite a matricula: ");
		f1.setMatricula(sc.nextInt());
		System.out.println("Entre com o salario do funcionario: ");
		f1.setSalario(sc.nextDouble());
		System.out.println(f1);
		System.out.println("Primeira parcela do salario: "+f1.getSalarioPrimeiraParcela(f1.getSalario()));
		System.out.println("Segunda parcela do salario: "+ f1.getSalarioSegundaParcela(f1.getSalario()));
		Professor pf = new Professor();
		System.out.println("Entre com o nome do Professor: ");
		pf.setNome(sc.nextLine());
		System.out.println("Entre com o sobrenome do Professor: ");
		pf.setSobrenome(sc.nextLine());
		System.out.println("Digite a matricula do Professor: ");
		pf.setMatricula(sc.nextInt());
		System.out.println("Entre com o salario do Professor: ");
		pf.setSalario(sc.nextDouble());
		System.out.println("primeira parcela do salario do professor: "+pf.getSalarioPrimeiraParcela(pf.getSalario()));
		System.out.println("segunda parcela do salario do professor: "+pf.getSalarioSegundaParcela(pf.getSalario()));
		sc.close();
	}

}
