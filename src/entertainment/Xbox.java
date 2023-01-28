package entertainment;

import playstrategy.PlayHandStrategy;

public class Xbox extends Entertainment {

    public Xbox() {
        super(new PlayHandStrategy());
    }

}