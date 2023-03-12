package homework2.part2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor

public class Workstation extends Laptop {

    private double procesor;

    public Workstation(int storage, String brand, double weight, double procesor) {
        super(storage, brand, weight);
        this.procesor = procesor;
    }

//    @Override
//    public String toString() {
//        return "Workstation{" +
//                "procesor=" + procesor +
//                "} " + super.toString();
//    }
}
