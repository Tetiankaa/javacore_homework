package homework3.part2;
//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play()
//        Гитара содержит переменные класса количествоСтрун,
//        Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента,
//        который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Instrument> instruments = new ArrayList<>();
//        instruments.add(new Guitar(7));
//        instruments.add(new Drum(55.5));
//        instruments.add(new Trumpet(8.5));
//        System.out.println(instruments); //[Guitar(string=7), Drum(dimensions=55.5), Trumpet(diameter=8.5)]

//        for (Instrument instrument : instruments) {
//            if (instrument instanceof Guitar){
//                instrument.play(); //Guitar with 7 strings is playing
//            }
//        }
//
//        for (Instrument instrument : instruments) {
//            if (instrument instanceof Drum){
//                instrument.play(); // Drum with dimensions 55.5 is playing
//            }
//        }
//        for (Instrument instrument : instruments) {
//            if (instrument instanceof  Trumpet){
//                instrument.play(); //Trumpet with diameter 8.5 is playing
//            }
//        }

        // OR ANOTHER WAY SEE BELOW

        List<Instrument> instruments = Arrays.asList(
                new Guitar(5),
                new Drum(40.2),
                new Trumpet(2.3)
        );

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

}
