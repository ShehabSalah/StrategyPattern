package entertainment;

import playstrategy.PlayPhysicalStrategy;

public class GYM extends Entertainment {

    public GYM() {
        super(new PlayPhysicalStrategy());
    }

}