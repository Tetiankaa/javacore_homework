package homework2.part2;

public class Ultrabook extends Laptop {
    private String graphicsCard;

    public Ultrabook(int storage, String brand, double weight, String graphicsCard) {
        super(storage, brand, weight);
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "graphicsCard='" + graphicsCard + '\'' +
                "} " + super.toString();
    }
}
