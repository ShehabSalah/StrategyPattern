package entertainment;

import playstrategy.PlayMindStrategy;

public class Backgammon extends Entertainment {

    public Backgammon() {
        super(new PlayMindStrategy());
    }

}