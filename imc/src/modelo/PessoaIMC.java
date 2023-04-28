package modelo;

abstract class PessoaIMC extends Pessoa {
	private double peso, altura;	
	public PessoaIMC(String nome, String dtNasc,double pes, double alt){		
		super(nome, dtNasc);
		this.peso = pes;
		this.altura = alt;
		}
	public PessoaIMC(){} 
		
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double calculaIMC(double peso, double altura) {
		double imc;
		imc = peso / (altura*altura);
		return imc;
	}
	abstract void resultIMC();
	
	public String toString() {
		return (super.toString()+"nome :"+getNome()+"\nData de Nascimento: "+getDtNasc()+"\nPeso: "+peso+"\nAltura: "+altura);
		}
	
}
