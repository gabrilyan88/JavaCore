package Less3;

public abstract class Fruits {
    private String name;
    private double weight;


    public Fruits(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
