package homework2.part2;
//Створити та описати наступну їєрархію(наслідування)
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!
public class Main {
    public static void main(String[] args) {
//    Laptop laptop = new Laptop(5,"hp",25.5);
//        System.out.println(laptop);

        Ultrabook ultrabook = new Ultrabook(512,"lenovo",15.2,"someCard");
        System.out.println(ultrabook);//Ultrabook{graphicsCard='someCard'} Laptop(super=PC{brand='lenovo', weight=15.2}, storage=512)

        Workstation workstation = new Workstation(1064,"samsung",20.0,168.5);
        System.out.println(workstation);//Workstation(super=Laptop(super=PC{brand='samsung', weight=20.0}, storage=1064), procesor=168.5), тому що визначено @ToString(callSuper = true)

    }
}
