package ExEncapsulamento;

public class Pessoa {
	//Atributos
	private String nome;
	private String endereco;
	private String telefone;
	
	//Construtor Padrão
	public Pessoa(String nome,String endereco,String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Opção 1 - construtor
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	
	//Opção 2 - construtor vazio
	public Pessoa()
	{
		
	}
	
	//Métodos seletores e modificadores
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
