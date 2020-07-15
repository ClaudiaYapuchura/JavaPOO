package ExEncapsulamento;

public class Empregado extends Pessoa{
	//Atributos
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	//Construtor padr�o
	public Empregado(String nome,String endereco,String telefone,int codigoSetor,double salarioBase,double imposto)
	{
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	//M�todo Calcular Salario
	public void getCalcularSalario()
	{
		double salarioTotal = salarioBase - (salarioBase * imposto);
		System.out.println("Sal�rio total � de R$ " + salarioTotal);
	}
	
	//M�todos seletores e modificadores
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}	
}
