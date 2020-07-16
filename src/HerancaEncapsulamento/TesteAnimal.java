package HerancaEncapsulamento;

import java.util.Scanner;

public class TesteAnimal {
	public static void main(String args[])
	{
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma das opções de animal: \n(1) Cachorro \n(2) Cavalo \n(3) Preguiça");
		
		int opcao = entrada.nextInt();
		
		switch(opcao)
		{
		case 1:
			animal = cachorro;
			break;
		case 2:
			animal = cavalo;
			break;
		case 3:
			animal = preguica;
			break;
		default:
			System.out.println("Ops, não é um animal existente no planeta Terra!!!");
		}
		
		if(opcao>=1 && opcao<=3)
			animal.emitirSom();
			animal.emitirAcao();
	}
}
