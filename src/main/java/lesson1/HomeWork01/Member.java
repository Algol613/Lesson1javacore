package lesson1.HomeWork01;

/**
 * Класс участников
 */

public class Member {

    private final int numberObstacles;
    private final int countMember = count;
    private int winMember = 0;
    public static int count = 0;


    public Member(int number) {
        this.numberObstacles = number;
        ++count;
    }

    public boolean goObstacles(int obstacles) {

        return (obstacles <= numberObstacles);
    }


    public int countObstacles(int valueObstacles) {

        if (goObstacles(valueObstacles)) {
            return valueObstacles;
        } else {
            printGoObstaclesError();
            return numberObstacles;
        }
    }


    public void printGoObstaclesError() {
        winMember = 1;
        System.out.println("Игрок № " + countMember + " проиграл, он может пройти не более " + numberObstacles + " препятствий");
    }


    public int getCountMember() {
        return countMember;
    }

    public int getNumberOfObstacles() {
        return numberObstacles;
    }

    public int getWinMember() {
        return winMember;
    }

}
