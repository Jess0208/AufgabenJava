package de.aufgaben.java.j.e;

public class FitzQuarkClasse {
    private static boolean OutlayIsNumber(int _Number) {
        return (!(_Number % 5 == 0 | _Number % 7 == 0));
    }

    private static void Outlay(int _Number) {
        if (OutlayIsNumber(_Number)) {
            System.out.println(_Number);
        }
        else if (_Number % 5 == 0 && _Number % 7 != 0) {
            System.out.println("Fitz!");
        }
        else if (_Number % 5 != 0 && _Number % 7 == 0) {
            System.out.println("Quark!");
        }
        else {
            System.out.println("FitzQuark!");
        }
    }

    public static void IndexCounter() {
        int IndexNumber = 1;
        while (IndexNumber <= 100) {
            Outlay(IndexNumber);
            IndexNumber++;
        }
    }
}
