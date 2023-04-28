package modelo;

public class Pessoa {
	private String nome;
	private String dtNasc;
	public Pessoa(String n,String d) {
		nome = n;
		dtNasc = d;				
	}
	public Pessoa() {};
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String toString() {
		return ("nome :"+nome+"\nData de Nascimento: "+dtNasc);
				
	}
	}
