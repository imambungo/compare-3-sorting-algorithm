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
    }
}