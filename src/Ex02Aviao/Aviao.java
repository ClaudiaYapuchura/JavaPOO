package Ex02Aviao;

public class Aviao {
	private String nomeFabricante;
	private String parModelo;
	private int numAssentos;
	private double parComp;
	private int pesoDecol;
	
	public Aviao(String fabricante,String modelo,int assentos,double comprimento,int pesMax)
	{
		nomeFabricante = fabricante;
		parModelo = modelo;
		numAssentos = assentos;
		parComp = comprimento;
		pesoDecol = pesMax;
	}
	
	public String getFrotaAviao()
	{
		String frotaAviao = "\nFabricante: " + nomeFabricante + "\nModelo: " + parModelo + "\nCapacidade: " + numAssentos + " passageiros" + "\nComprimento: " + parComp + "m" + "\nPeso máximo da decolagem: " + pesoDecol + " toneladas";
		return frotaAviao;
	}
	
}
