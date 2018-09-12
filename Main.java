class Main {
    public static void main(String[] args) {


        int panjangArray = 10;
        int banyakSample = 3;

        System.out.println("Membandingkan kecepatan 3 algoritma sorting (dalam nanoSecond)\n");
        System.out.println("\t\tbubbleSort\tselectionSort\tinsertionSort");

        // Looping sebanyak sample
        for (int i = 1; i <= banyakSample; i++) {
            // Inisialisasi array-nya
            MyArray untukBubble = new MyArray(panjangArray);
            MyArray untukSelection = new MyArray(panjangArray);
            MyArray untukInsertion = new MyArray(panjangArray);

            // Isi ketiga array dengan nilai random antara 1-100
            untukBubble.randomArray();
            untukSelection.randomArray();
            untukInsertion.randomArray();

            System.out.print("sample " + i +":\t");

            // Hitung waktu sorting dengan bubbleSort
            HitungWaktu.startTime();
            Sorting.bubbleSort(untukBubble.getArr());
            HitungWaktu.endTime();
            HitungWaktu.runTime();
            System.out.print("\t\t");

            // Hitung waktu sorting dengan selectionSort
            HitungWaktu.startTime();
            Sorting.selectionSort(untukSelection.getArr());
            HitungWaktu.endTime();
            HitungWaktu.runTime();
            System.out.print("\t\t");

            // Hitung waktu sorting dengan insertionSort
            HitungWaktu.startTime();
            Sorting.insertionSort(untukInsertion.getArr());
            HitungWaktu.endTime();
            HitungWaktu.runTime();
            System.out.println();
        }
    }
}