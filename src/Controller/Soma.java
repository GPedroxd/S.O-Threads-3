package Controller;

public class Soma extends Thread{
	private int pos;
	private int[] array;
	public Soma(int pos, int [] array) {
		this.array = array;
		this.pos = pos;
	}
	@Override
	public void run() {
		int some = 0;
		for (int i : array) {
			some += i;
		}
		System.out.println("Linha: " +pos+ " Soma: "+some);
	}
}
