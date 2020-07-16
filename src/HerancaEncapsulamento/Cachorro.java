package HerancaEncapsulamento;

public class Cachorro extends Animal{
	public Cachorro()
	{
		super("Marley",6);
	}
	public void emitirSom()
	{
		System.out.println("Au au au!!!");
	}
	
	public void emitirAcao()
	{
		System.out.println("Deve correr...");
	}
}
