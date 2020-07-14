package Ex01Cliente;

public class Cliente {
	private String nomeInicial;
	private String sobrenome;
	private int numeroRg;
	private long numeroCpf;
	private int numeroTelefone;
	private String enderecoEmail;
	
	public Cliente(String nome,String sNome,int rg,long cpf,int telefone,String email)
	{
		nomeInicial = nome;
		sobrenome = sNome;
		numeroRg = rg;
		numeroCpf = cpf;
		numeroTelefone = telefone;
		enderecoEmail = email;
	}
	
	public String getDadosCliente()
	{
		String DadosCliente = "\nNome:" + nomeInicial + " " + sobrenome + "\nRG: " + numeroRg + "\nCPF: " + numeroCpf + "\nTelefone: " + numeroTelefone +"\nEmail: " + enderecoEmail;
		return DadosCliente;
	}
}
