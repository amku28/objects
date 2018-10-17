public class Pig {
    String name;
    double weight;
    double weightGain;
    double weightLoss;
    boolean hasEaten;

    public Pig(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String eat(int poundsOfFood) {
        weightGain = poundsOfFood * 0.75;
        weight += weightGain;
        hasEaten = true;
        return this.name + " has gained " + weightGain + " pounds";
    }

    public String exercise(double hoursOfExercise) {
        weightLoss -= hoursOfExercise * (1.0 / 3);
        if (hasEaten) {
            weight -= weightGain + weightLoss;
            return this.name + " has lost " + weightGain + " pounds from food and " + weightLoss + " pounds from exercise";
        } else {
            weight -= weightLoss;
            return this.name + " has lost " + weightLoss + " pounds";
        }
    }

    public boolean blueRibbonEligible() {
        if (weight > 1000) {
            return true;
        } else {
            return false;
        }
    }
}