package ExEncapsulamento;

public class Pessoa {
	//Atributos
	private String nome;
	private String endereco;
	private String telefone;
	
	//Construtor Padr�o
	public Pessoa(String nome,String endereco,String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Op��o 1 - construtor
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	
	//Op��o 2 - construtor vazio
	public Pessoa()
	{
		
	}
	
	//M�todos seletores e modificadores
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
