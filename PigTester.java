public class PigTester {
    public static void main(String[] args) {
        Pig fatty = new Pig("fatty", 420);

        System.out.println(fatty.getWeight());

        System.out.println(fatty.eat(700));

        System.out.println(fatty.getWeight());

        System.out.println(fatty.exercise(1000.0));

        System.out.println(fatty.getWeight());

        System.out.println(fatty.blueRibbonEligible());
    }
}