package HerancaEncapsulamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collections {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		Collection<String> estoque = new ArrayList();
		
		int escolha;
		String produto;
		String atualizacao;
		
		do
		{
			System.out.println("Escolha uma das opções: \n(1)Adicionar um produto na lista \n(2)Remover um produto da lista \n(3)Atualizar um produto na lista \n(4)Apresentar a lista de produtos");
			escolha = ler.nextInt();
			
			if(escolha == 1)
			{
				System.out.println("Digite um produto para adicionar na lista:");
				produto = ler.next();
				estoque.add(produto);
			}
			
			else if(escolha == 2)
			{
				System.out.println("Digite o produto para remover da lista:");
				produto = ler.next();
				estoque.remove(produto);
			}
			
			else if(escolha == 3)
			{
				System.out.println("Digite um produto para atualizar na lista:");
				atualizacao = ler.next();
				
				System.out.println("Digite o produto para remover da lista:");
				produto = ler.next();
					
				if (estoque.contains(produto));
				{
					estoque.remove(produto);
					estoque.add(atualizacao);
				}	
			}
			
			else if(escolha == 4)
				System.out.println("Produtos na lista: " + estoque);
			else
				System.out.println("Ops. Opção inexistente!");
		}
		while(escolha != 0);
	}
}
