public class Dog {
    // Properties (variables)
    String name;
    String breed;
    int tagNumber;
    int happiness;
    boolean beenPet;

    // Constructor(s)
    public Dog(String name, String breed, int tagNumber, int happiness, boolean beenPet) {
        this.name = name;
        this.breed = breed;
        this.tagNumber = tagNumber;
        this.happiness = happiness;
        this.beenPet = beenPet;
    }

    // Abilities
        // Getters and Setters
            // Getter is for knowing things
            // Setter is for changing things
    // Getters
    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }

    public String getHappiness() {
        return this.happiness + "% happiness";
    }

    public boolean beenPet() {
        return this.beenPet;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setTagNumber(int tagNumber) {
        if (tagNumber < 0) return;
        this.tagNumber = tagNumber;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    // Rest of abilities
        // Bark -> Woof!
        // Say Hi -> Bark, My name is "name"
    public String bark() {
        return "Woof!";
    }

    public String sayHi() {
        return bark() + " My name is " + this.name;
    }

    public String pet() {
        System.out.println("You pet " + this.name);
        this.happiness += 10;
        this.beenPet = true;
        return this.name + " is 10% happier";
    }

    public String eat() {
        if (happiness > 25 && beenPet) {
            System.out.println(this.name + " eats");
            this.beenPet = false;
            happiness += 8;
            return this.name + " is now happier";
        } else {
            return this.name + " is not happy enough to eat";
        }
    }

    public String scold() {
        System.out.println("You scold " + this.name);
        happiness -= 20;
        return this.name + " is 20% less happy";
    }
}

// dogs can now be petted. When a dog is petted, it becomes 10% happier. If a dog
// is less than 25% happy she will refuse to eat. Eating makes a dog happier, unless
// she hasn't been petted since her last meal. Dogs also become 20% less happy when scolded.