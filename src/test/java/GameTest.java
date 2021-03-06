import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.learnup.javaqa.group2.chernykh3.Statistics;

public class GameTest {

    @Test
    public void shouldCountLosers() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {9, 6, 0, 10, 8};

        int actual = statistics.droppedOut(speeds);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersNought() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {0, 0, 0, 0, 0};

        int actual = statistics.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersMaxSpeed() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {7, 7, 8, 7, 8};

        int actual = statistics.droppedOut(speeds);

        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersBigNumbers() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {999999, 666632, 726189, 0, 8};

        int actual = statistics.droppedOut(speeds);

        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersNoOne() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {};

        int actual = statistics.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersTrue() {
        Statistics statistics = new Statistics(true);
        statistics.maxSpeed = 7;

        int[] speeds = {9, 6, 7, 10, 0, 8};

        int actual = statistics.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosers() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {9, 6, 0, 10, 8};

        int[] actual = statistics.speedDroppedOut(speeds);

        int[] expected = {9, 10, 8};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersNought() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {0, 0, 0, 0, 0};

        int[] actual = statistics.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersBigNumbers() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {998655, 62342, 0, 10000000, 891010};

        int[] actual = statistics.speedDroppedOut(speeds);

        int[] expected = {998655, 62342, 10000000, 891010};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersBorder() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {7, 8, 7, 7, 8};

        int[] actual = statistics.speedDroppedOut(speeds);

        int[] expected = {8, 8};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersOnePlayer() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {10};

        int[] actual = statistics.speedDroppedOut(speeds);

        int[] expected = {10};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersTrue() {
        Statistics statistics = new Statistics(true);
        statistics.maxSpeed = 7;

        int[] speeds = {9, 6, 0, 10, 8};

        int[] actual = statistics.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinners() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {9, 6, 0, 10, 8};

        int[] actual = statistics.speedStayedIn(speeds);

        int[] expected = {6, 0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersNought() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {0, 0, 0, 0, 0};

        int[] actual = statistics.speedStayedIn(speeds);

        int[] expected = {0, 0, 0, 0, 0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersBorders() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        int[] speeds = {8, 7, 8, 7, 7};

        int[] actual = statistics.speedStayedIn(speeds);

        int[] expected = {7, 7, 7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersTrue() {
        Statistics statistics = new Statistics(true);
        statistics.maxSpeed = 7;

        int[] speeds = {0, 0, 0, 0, 0};

        int[] actual = statistics.speedStayedIn(speeds);

        int[] expected = {0, 0, 0, 0, 0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSurvivors() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        String[] playersName = {"Nick 9", "Leo 6", "Chris 0", "Alex 10", "Jen 8"};

        String[] actual = statistics.survivors(playersName);

        String[] expected = {"Leo", "Chris"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSurvivorsNought() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        String[] playersName = {"Nick 0", "Leo 0", "Chris 0", "Alex 0", "Jen 8"};

        String[] actual = statistics.survivors(playersName);

        String[] expected = {"Nick", "Leo", "Chris", "Alex"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSurvivorsBorders() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        String[] playersName = {"Nick 8", "Leo 7", "Chris 7", "Alex 7", "Jen 8"};

        String[] actual = statistics.survivors(playersName);

        String[] expected = {"Leo", "Chris", "Alex"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSurvivorsOneLetter() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        String[] playersName = {"N 9", "L 6", "C 0", "A 10", "J 8"};

        String[] actual = statistics.survivors(playersName);

        String[] expected = {"L", "C"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSurvivorsBigNumbers() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        String[] playersName = {"Nick 991837", "Leo 100000", "Chris 8726289", "Alex 1", "Jen 229287"};

        String[] actual = statistics.survivors(playersName);

        String[] expected = {"Alex"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSurvivorsNoWinners() {
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 7;

        String[] playersName = {"Nick 9", "Leo 60", "Chris 20", "Alex 10", "Jen 8"};

        String[] actual = statistics.survivors(playersName);

        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSurvivorsTrue() {
        Statistics statistics = new Statistics(true);
        statistics.maxSpeed = 7;

        String[] playersName = {"Nick 9", "Leo 6", "Chris 0", "Alex 10", "Jen 8"};

        String[] actual = statistics.survivors(playersName);

        String[] expected = {"Nick", "Leo", "Chris", "Alex", "Jen"};

        Assertions.assertArrayEquals(expected, actual);
    }


}
