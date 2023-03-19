package homework3.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable{
   private String name;
    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + ":" + this.name);
    }
}
