import java.util.Random;
class MyMatrix{
    private int[][] matrix;

    public MyMatrix(int x, int y) {
        this.matrix = new int[x][y];
    }

    public void randomMatrix() {
        Random rand = new Random();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                this.matrix[i][j] = rand.nextInt(100) + 1;
            }
        }
    }

    public void showMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                System.out.print(this.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}