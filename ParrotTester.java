public class ParrotTester {
    public static void main(String[] args) {
        Parrot talkO = new Parrot("talk-o", "ahhhhhhhhh");

        System.out.println(talkO.getName());
        System.out.println(talkO.getLastWord());

        System.out.println(talkO.talk());
        System.out.println(talkO.talk());

        talkO.setLastWord("padjen");

        System.out.println(talkO.talk());
        System.out.println(talkO.talk());
        System.out.println(talkO.talk());
    }
}