package Ex02Aviao;

public class InfAviao {
	public static void main(String args[])
	{
		Aviao aviao1 = new Aviao("Airbus","A320",144,33.48,70);
		Aviao aviao2 = new Aviao("Boeing","B767",238,47.6,184);
		System.out.println(aviao1.getFrotaAviao());
		System.out.println(aviao2.getFrotaAviao());
	}
}
