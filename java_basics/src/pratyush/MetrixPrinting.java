package pratyush;

public class MetrixPrinting {
	public static void printMetrix(final int A[][]) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printInZShape(final int A[][]) {
		System.out.println("\nMetrix In Z shape:\n");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {

				if (i == 0 || i == (6 - 1)) {
					System.out.print(A[i][j] + " ");
				} else {

					if (j == (6 - i - 1)) {
						System.out.print(A[i][6 - i - 1] + " ");
					} else {
						System.out.print("  ");
					}
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		final int A[][] = { { 1, 3, 4, 7, 8, 3 }, { 2, 6, 9, 2, 4, 3 }, { 5, 7, 9, 8, 6, 4 }, { 5, 7, 1, 8, 6, 4 },
				{ 5, 7, 7, 8, 6, 4 }, { 5, 7, 6, 8, 6, 4 } };
		printMetrix(A);
		printInZShape(A);
	}
}
