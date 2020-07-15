package ExEncapsulamento;

public class Fornecedor extends Pessoa{
	//Atributos
	private double valorCredito;
	private double valorDivida;
	
	//Construtor padrão
	public Fornecedor(String nome,String endereco,String telefone, double valorCredito,double valorDivida)
	{
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//Método Obter Saldo
	public void getSaldo()
	{
		double saldo = (valorCredito - valorDivida);
		System.out.println("Seu saldo é R$ " + saldo);
	}
	
	//Métodos seletores e modificadores
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
