package entertainment;

import playstrategy.PlayHandStrategy;

public class PlayStation extends Entertainment {

    public PlayStation() {
        super(new PlayHandStrategy());
    }

}