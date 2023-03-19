package homework3.part1;

import java.util.ArrayList;

public class Library {

    private static final ArrayList<Printable> library = new ArrayList<>();

    public static void add(Printable item){
        library.add(item);
    }

    public static void showBooks(){
        for (Printable printable : library) {
            if (printable  instanceof Book ){
                printable.print();
            }
        }
    }

    public static void showMagazines(){
        for (Printable printable : library) {
            if (printable instanceof Magazine){
                printable.print();
            }
        }
    }
}
