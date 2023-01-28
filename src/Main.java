import entertainment.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("entertainment.PlayStation: ");
        PlayStation playStation = new PlayStation();
        playStation.executePlay();
        playStation.watchOthersPlay();

        System.out.println("--------------------");
        System.out.println("entertainment.Xbox: ");
        Xbox xbox = new Xbox();
        xbox.executePlay();
        xbox.watchOthersPlay();

        System.out.println("--------------------");
        System.out.println("entertainment.GYM: ");
        GYM gym = new GYM();
        gym.executePlay();
        gym.watchOthersPlay();

        System.out.println("--------------------");
        System.out.println("entertainment.Chess: ");
        Chess chess = new Chess();
        chess.executePlay();
        chess.watchOthersPlay();

        System.out.println("--------------------");
        System.out.println("entertainment.Backgammon: ");
        Backgammon backgammon = new Backgammon();
        backgammon.executePlay();
        backgammon.watchOthersPlay();
    }

}