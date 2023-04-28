package modelo;

public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;
	public Funcionario(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}
	public Funcionario() {};
	public Funcionario(Pessoa p, int matricula, double salario) {
		super(p.getNome(),p.getSobrenome());
		this.matricula = matricula;
		this.salario = salario;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalarioPrimeiraParcela(double s){
		return (s * 0.6) ;
	}
	public double getSalarioSegundaParcela(double s) {
		return (s * 0.4) ;
	}
	public String toString() {
		return (super.toString()+"\nMatricula: "+this.matricula+"\nSalario: "+this.salario);
	}
}
