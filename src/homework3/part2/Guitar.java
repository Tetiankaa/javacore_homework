package homework3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Guitar implements Instrument{
    private int string;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() +" " + "with" +" "+ this.string +" "+ "strings is playing");
    }
}
