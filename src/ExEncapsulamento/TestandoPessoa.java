package ExEncapsulamento;

public class TestandoPessoa {
	public static void main(String[] args)
	{
		Pessoa pessoa = new Pessoa("Claudia","Rua Nova OLinda","2909-8811");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Endereco: " + pessoa.getEndereco());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		System.out.println("\n------------------------------------------------\n");
		
		Fornecedor fornecedor = new Fornecedor("Cristina","Rua das Flores","1234-5678",600.00,500.00);
		fornecedor.getSaldo();
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("Endereco: " + fornecedor.getEndereco());
		System.out.println("Telefone: " + fornecedor.getTelefone());
		
		System.out.println("\n------------------------------------------------\n");
		
		Empregado empregado = new Empregado("Empregado1","Av. Paulista", "4321-8765",45,3500.00,0.25);
		empregado.getCalcularSalario();
		System.out.println("Nome: " + empregado.getNome());
		System.out.println("Endereco: " + empregado.getEndereco());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.println("Código: " + empregado.getCodigoSetor());
		
		System.out.println("\n------------------------------------------------\n");
	}
}
