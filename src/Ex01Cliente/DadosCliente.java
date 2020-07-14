package Ex01Cliente;

public class DadosCliente {
	public static void main(String args[])
	{
		Cliente cliente1 = new Cliente("Claudia","Yapuchura",111111,12345678911L,123456789,"claudia@generation.com.br");
		Cliente cliente2 = new Cliente("Lais","Regina",222222,98765432122L,987654321,"lais@generation.com.br");
		
		System.out.println(cliente1.getDadosCliente());
		System.out.println(cliente2.getDadosCliente());
	}
}
