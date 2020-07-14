package ExEncapsulamento;

public class TestandoPessoa {
	public static void main(String[] args)
	{
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Claudia");
		pessoa1.setEndereco("Rua Nova Olinda");
		pessoa1.setTelefone("2909-8811");
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Endereco: " + pessoa1.getEndereco());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Cristina");
		pessoa2.setEndereco("Rua das Flores");
		pessoa2.setTelefone("1234-5678");
		
		System.out.println("\nNome: " + pessoa2.getNome());
		System.out.println("Endereco: " + pessoa2.getEndereco());
		System.out.println("Telefone: " + pessoa2.getTelefone());
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Lais");
		pessoa3.setEndereco("Rua Maria Cândida");
		pessoa3.setTelefone("1234-8910");
		
		System.out.println("\nNome: " + pessoa3.getNome());
		System.out.println("Endereco: " + pessoa3.getEndereco());
		System.out.println("Telefone: " + pessoa3.getTelefone());
	}
}
