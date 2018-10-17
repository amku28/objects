public class CatTester {
    public static void main(String[] args) {
        Cat garfield = new Cat("garfield", "orange", 50);

        System.out.println(garfield.getName());

        System.out.println(garfield.meow());

        System.out.println(garfield.pet());

        System.out.println(garfield.eat());

        System.out.println(garfield.scold());
        System.out.println(garfield.scold());
        System.out.println(garfield.scold());

        System.out.println(garfield.eat());
    }
}