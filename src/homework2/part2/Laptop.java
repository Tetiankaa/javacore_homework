package homework2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Laptop extends PC{
    private int storage;

    public Laptop(int storage,String brand,double weight){
        super(brand,weight);
        this.storage=storage;
    }

//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "storage=" + storage +
//                "} " + super.toString();
//    }
}
