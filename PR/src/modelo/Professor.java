package modelo;

public class Professor extends Funcionario{
	public Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome,sobrenome,matricula,salario);
	}
	public Professor(Pessoa p,int matricula, double salario) {
		super(p,matricula,salario);
	}
	public Professor() {};
	@Override
	public double getSalarioPrimeiraParcela(double s) {
		return s;
	}
	@Override
	public double getSalarioSegundaParcela(double s) {
		return 0;
	}
	public String toString() {
		return (super.toString()+"\nMatricula: "+this.getMatricula()+"\nSalario: "+this.getSalario());}
}
