package ExEncapsulamento;

public class Fornecedor extends Pessoa{
	//Atributos
	private double valorCredito;
	private double valorDivida;
	
	//Construtor padr�o
	public Fornecedor(String nome,String endereco,String telefone, double valorCredito,double valorDivida)
	{
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//M�todo Obter Saldo
	public void getSaldo()
	{
		double saldo = (valorCredito - valorDivida);
		System.out.println("Seu saldo � R$ " + saldo);
	}
	
	//M�todos seletores e modificadores
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
}
