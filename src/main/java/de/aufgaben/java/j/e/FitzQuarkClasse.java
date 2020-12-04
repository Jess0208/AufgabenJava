package de.aufgaben.java.j.e;

public class FitzQuarkClasse {
    static int LOOP_NUMBER = 100;
    static int LOOP_START = 1;
    static int FITZ_NUMBER = 5;
    static int QUARK_NUMBER = 7;

    private static void Outlay(int _Number) {
       if (_Number % FITZ_NUMBER == 0 && _Number % QUARK_NUMBER == 0) {
            System.out.println("FitzQuark!");
        }
        else if (_Number % FITZ_NUMBER == 0) {
            System.out.println("Fitz!");
        }
        else if (_Number % QUARK_NUMBER == 0) {
            System.out.println("Quark!");
        }
        else {
            System.out.println(_Number);
       }
    }

    public static void IndexCounter() {
        int IndexNumber = LOOP_START;
        while (IndexNumber <= LOOP_NUMBER) {
            Outlay(IndexNumber);
            IndexNumber++;
        }
    }
}
