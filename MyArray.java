import java.util.Random;

class MyArray {
    private int[] arr;

    public MyArray(int x) {
        this.arr = new int[x];
    }

    public void randomArray() {
        Random rand = new Random();
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = rand.nextInt(100) + 1;
        }
    }

    public void showArray() {
        for (int i = 0; i < this.arr.length; i++) {
                System.out.print(this.arr[i] + " ");
        }
    }
}