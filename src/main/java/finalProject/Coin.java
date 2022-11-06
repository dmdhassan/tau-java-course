package finalProject;

import java.util.Random;

public class Coin {
    public String side;
    public String HEADS = "heads";
    public String TAILS = "tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip() {
        if (new Random().nextBoolean()) {
            setSide(HEADS);
        } else {
            setSide(TAILS);
        }

        return getSide();
    }
}
