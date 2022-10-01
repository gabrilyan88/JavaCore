package Less3;


import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruits> {

    private List<T> fruitsList;
    private double totalWeight;

    public Box() {
        this.fruitsList = new ArrayList<>();
    }


    public void changeBox(Box<? super T> another){

        if (another==this){
            return;
        }
        another.fruitsList.addAll(this.fruitsList);
        this.fruitsList.clear();}

    public void addFruit(T fruits) {
        fruitsList.add(fruits);

        totalWeight = totalWeight + fruits.getWeight();
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean compare(Box T) {
        if (this.totalWeight == T.totalWeight) {
            return true;
        }

        return false;
    }
    public List<T> getFruitsList() {
        return fruitsList;
    }

}





