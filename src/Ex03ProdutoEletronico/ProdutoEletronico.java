package Ex03ProdutoEletronico;

public class ProdutoEletronico {
	private String prodMarca;
	private String prodModelo;
	private String prodCor;
	private int infLargura;
	private int infAltura;
	private int quantDisponivel;
	private int quantReserva;
	
	public ProdutoEletronico(String marca,String modelo,String cor,int largura,int altura,int dispProd)
	{
		prodMarca = marca;
		prodModelo = modelo;
		prodCor = cor;
		infLargura = largura;
		infAltura = altura;
		quantDisponivel = dispProd;
		quantReserva = 0;
	}
	
	public void reservarPE (int dispProd) {
		if (quantDisponivel >= dispProd) {
			quantReserva = dispProd;
			quantDisponivel -= quantReserva;
		} else {
			System.out.println("Quantidade do produto indisponível.");
		}	
	}
	
	public String statusProduto()
	{
		String status = ("\nMarca: " + prodMarca + "\nModelo: " + prodModelo + "\nCor: " + prodCor + "\nLargura: " + infLargura + "\nAltura: " + infAltura +"\nNúmero de Produtos disponíveis: " + quantDisponivel + "\nNúmero de Produtos reservados: "
				+ quantReserva);
		System.out.println(status);
		return status;
	}
}
