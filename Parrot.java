public class Parrot {
    String name;
    String lastWord;
    int talkCount = 0;
    String sameWord;
    int sameWordCount = 0;

    public Parrot(String name, String lastWord) {
        this.name = name;
        this.lastWord = lastWord;
        sameWord = this.lastWord;
    }

    public String getName() {
        return this.name;
    }

    public String getLastWord() {
        return this.lastWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastWord(String lastWord) {
        sameWordCount = 0;
        this.lastWord = lastWord;
        sameWord = this.lastWord;
    }

    public String talk() {
        talkCount++;
        sameWordCount++;
        if (talkCount % 3 == 0) {
            System.out.println("squawk!");
        }
        if (sameWordCount % 3 == 0) {
            System.out.println("squawk! squawk!");
        }
        return this.lastWord + "!";
    }
}