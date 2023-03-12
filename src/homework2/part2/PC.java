package homework2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PC {
    private String brand;
    private double weight;

    public PC() {
    }

    public PC(String brand, double weight) {
        this.brand = brand;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}
