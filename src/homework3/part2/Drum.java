package homework3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Drum implements Instrument{
    private double dimensions;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() +" "+ "with dimensions"+" " + this.dimensions +" "+ "is playing");
    }
}
