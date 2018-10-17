public class DogTester {
    public static void main(String[] args) {
        Dog rover = new Dog("Rover", "Dalmation", 1, 50, false);
        Dog dog2 = new Dog("Clifford", "BigRed", 2, 50, false);

        System.out.println(rover.getName());
        System.out.println(dog2.getName());

        dog2.setName("cheeka cheeeka slim shady");

        System.out.println(rover.bark());
        System.out.println(dog2.sayHi());

        System.out.println(dog2.pet());

        System.out.println(dog2.eat());

        System.out.println(dog2.scold());

        System.out.println(dog2.getHappiness());
    }
}