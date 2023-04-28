package modelo;

public class Pessoa {
	private String nome;
	private String sobrenome;
	public Pessoa (String n, String s){
		nome = n;
		sobrenome = s;		
	}
	public Pessoa() {}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	};
	public String getNomeCompleto() {
		return (nome+" "+sobrenome);
	}
	public String toString() {
		return ("Nome :"+nome+"\nSobrenome: "+sobrenome);
	}
}

	