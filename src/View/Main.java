package View;

import Controller.Soma;

public class Main {

	public static void main(String[] args) {
		int [][] matrix = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = (int)(Math.random() *11);
			}
		}
		new Soma(1, matrix[0]).start();
		new Soma(2, matrix[1]).start();
		new Soma(3, matrix[2]).start();
	}

}
