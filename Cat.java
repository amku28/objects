public class Cat {
    String name;
    String color;
    int happiness;
    int scold = 0;

    public Cat(String name, String color, int happiness) {
        this.name = name;
        this.color = color;
        this.happiness = happiness;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getHappiness() {
        return this.happiness + "% happiness";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public String meow() {
        return "meow bitch";
    }

    public String pet() {
        happiness -= 50;
        System.out.println("You pet " + this.name);
        return this.name + " is now 50% less happy";
    }

    public String scold() {
        scold += 1;
        return "You scold " + this.name;
    }

    public String eat() {
        if (scold >= 3) {
            scold = 0;
            happiness += 7;
            System.out.println(this.name + " is happier");
        } else {
            System.out.println(this.name + " has not been scolded enough to raise happiness");
        }
        return this.name + " eats";
    }
}

// cats hate to be petted, losing 50% happiness. Eating does not make a cat happier,
// unless they have been scolded at least 3 times since their last meal.