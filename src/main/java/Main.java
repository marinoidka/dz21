import java.util.Arrays;
import pro.learnup.javaqa.group2.chernykh3.Game;
import pro.learnup.javaqa.group2.chernykh3.Statistics;

public class Main {

    public static void main(String[] args) {

        int[] speeds = {9, 6, 0, 10, 8};
        String[] playersName = {"Nick 9", "Leo 6", "Chris 0", "Alex 10", "Jen 8"};

        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        Game game = new Game (false);
        game.setLight(true);
        game.getLight();

        SpeedyGame speedyGame = new SpeedyGame(7, false);
        speedyGame.setLight(true);


        System.out.println("Количество выбывших игроков: " + statistics.droppedOut(speeds));
        System.out.println("Скорость выбывших игроков: " + Arrays.toString(statistics.speedDroppedOut(speeds)));
        System.out.println("Скорость выживших игроков: " + Arrays.toString(statistics.speedStayedIn(speeds)));
        System.out.println("Имена выживших игроков: " +  Arrays.toString(statistics.survivors(playersName)));

        System.out.println("Проиграл ли игрок?: " + game.isFailed(5, false));
        System.out.println("Проиграл ли игрок?: " + speedyGame.isFailed(5, false));
    }

}
