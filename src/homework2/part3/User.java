package homework2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;

    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skills> skills = new ArrayList<>();
    private Car car;


    public User(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skills> skills, String model,int year,int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model,year,power);
    }
}
