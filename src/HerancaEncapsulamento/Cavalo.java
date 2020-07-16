package HerancaEncapsulamento;

public class Cavalo extends Animal{
	public Cavalo()
	{
		super("Wildfire",20);
	}
	public void emitirSom()
	{
		System.out.println("Hinn in in...");
	}
	
	public void emitirAcao()
	{
		System.out.println("Correndo...");
	}
}
