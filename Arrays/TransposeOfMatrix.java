package Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {

        int[][] matris = {{1, 2, 3}, {4, 5, 6}};
        int[][] reverse = new int[3][2];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                reverse[j][i] = matris[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(reverse[i][j] + " ");
            }
            System.out.println();
        }
    }
}
