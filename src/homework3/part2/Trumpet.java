package homework3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trumpet implements Instrument {
    private double diameter;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() +" "+ "with diameter" +" "+ this.diameter +" "+ "is playing");
    }
}
