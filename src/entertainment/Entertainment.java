package entertainment;

import playstrategy.PlayStrategy;

public class Entertainment {

    private final PlayStrategy playStrategy;

    public Entertainment(PlayStrategy playStrategy) {
        this.playStrategy = playStrategy;
    }

    public void executePlay() {
        playStrategy.play();
    }

    public void watchOthersPlay() {
        System.out.println("Watching others play...");
    }

}