public class Mouse {
    String name;
    int safety = 100;
    int runAwaySpeed = 0;

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getRunAwaySpeed() {
        return runAwaySpeed + " miles per hour";
    }

    public void setRunAwaySpeed(int runAwaySpeed) {
        this.runAwaySpeed = runAwaySpeed;
    }

    public String meetsCat() {
        safety -= 10;
        runAwaySpeed += 10;
        System.out.println(this.name + " meets a cat");
        return this.name + " feels less safe";
    }

    
}