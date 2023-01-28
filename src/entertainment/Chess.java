package entertainment;

import playstrategy.PlayMindStrategy;

public class Chess extends Entertainment {

    public Chess() {
        super(new PlayMindStrategy());
    }

}