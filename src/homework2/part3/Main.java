package homework2.part3;

import java.util.ArrayList;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
public class Main {
    public static void main(String[] args) {

        //COMPOSITION
//        Skills skills = new Skills(Title.JAVA,2);
//        Car car = new Car("kia",2015,250);
//        User userTanya = new User(1,"Tanya","Korsun","tanya@gmail.com",26,Gender.MALE,new ArrayList<>(),car);
//
//        ArrayList<Skills> skills= userTanya.getSkills();
//        skills.add(new Skills(Title.JS,1));
//        skills.add(new Skills(Title.C_PLUS_PLUS,5));
//        System.out.println(userTanya);

        //AGGREGATION
//        User userT = new User(1,"tanya","korsun","tanya@gmail.com",26,Gender.MALE,Title.C_PLUS_PLUS,3.5,"skoda",2010,190);
//        System.out.println(userT);
    }
}
