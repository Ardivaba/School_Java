package project1;

public class Loops {

	public static void main(String[] args) {

		int size = 10;

		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.format("%2d", size - 1 - (col > row ? col : row));
			}

			System.out.println();
		}

	}

}
