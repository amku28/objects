public class MouseTester {
    public static void main(String[] args) {
        Mouse jerry = new Mouse("jerry");

        Dog clifford = new Dog("clifford", "bigred", 2, 50, false);

        System.out.println(jerry.getRunAwaySpeed());

        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());
        System.out.println(jerry.meetsCat());

        System.out.println(jerry.getRunAwaySpeed());

        if (jerry.runAwaySpeed > 60) {
            System.out.println("That's a motherf*cker faster than sanic!");
        }
    }
}
// When a mouse meets a cat, it feels less safe. When a mouse meets a dog,
// it feels more safe, but only when the dog is happy. The less safe a mouse feels, the
// faster it can run away.