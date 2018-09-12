class Main {
    public static void main(String[] args) {


        int panjangArray = 100000;
        int banyakSample = 30;

        System.out.println("Membandingkan kecepatan 3 algoritma sorting (dalam milliSecond)\n");
        System.out.println("\t\tbubbleSort\tselectionSort\tinsertionSort");

        // Looping sebanyak sample
        for (int i = 1; i <= banyakSample; i++) {
            // Inisialisasi array-nya
            MyArray untukBubble = new MyArray(panjangArray);
            MyArray untukSelection = new MyArray(panjangArray);
            MyArray untukInsertion = new MyArray(panjangArray);

            // Isi ketiga array dengan nilai random antara 1-100000
            untukBubble.randomArray();
            untukSelection.randomArray();
            untukInsertion.randomArray();

            System.out.print("sample " + i +":\t");

            // Hitung waktu sorting dengan bubbleSort
            HitungWaktu.startTimeM();
            Sorting.bubbleSort(untukBubble.getArr());
            HitungWaktu.endTimeM();
            HitungWaktu.runTime();
            System.out.print("\t\t");

            // Hitung waktu sorting dengan selectionSort
            HitungWaktu.startTimeM();
            Sorting.selectionSort(untukSelection.getArr());
            HitungWaktu.endTimeM();
            HitungWaktu.runTime();
            System.out.print("\t\t");

            // Hitung waktu sorting dengan insertionSort
            HitungWaktu.startTimeM();
            Sorting.insertionSort(untukInsertion.getArr());
            HitungWaktu.endTimeM();
            HitungWaktu.runTime();
            System.out.println();
        }
    }
}