class Main {
    public static void main(String[] args) {

        // Inisialisasi array-nya
        MyArray untukBubble = new MyArray(10000);
        MyArray untukSelection = new MyArray(10000);
        MyArray untukInsertion = new MyArray(10000);

        // Isi dengan nilai random antara 1-100
        untukBubble.randomArray();
        untukSelection.randomArray();
        untukInsertion.randomArray();



        // untukBubble.showArray();
        // Hitung waktu sorting dengan bubbleSort
        HitungWaktu.startTime();
        Sorting.bubbleSort(untukBubble.getArr());
        HitungWaktu.endTime();
        HitungWaktu.runTime();
        // untukBubble.showArray();

        // untukSelection.showArray();
        // Hitung waktu sorting dengan selectionSort
        HitungWaktu.startTime();
        Sorting.selectionSort(untukSelection.getArr());
        HitungWaktu.endTime();
        HitungWaktu.runTime();
        // untukSelection.showArray();
        
        // untukInsertion.showArray();
        // Hitung waktu sorting dengan insertionSort
        HitungWaktu.startTime();
        Sorting.insertionSort(untukInsertion.getArr());
        HitungWaktu.endTime();
        HitungWaktu.runTime();
        // untukInsertion.showArray();
    }
}