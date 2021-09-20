package lesson1.HomeWork01;

/**
 * Класс препятствий
 */

public class Obstacles {

    public int countCourses;
    public static int count = 0;

    public Obstacles(int number) {
        ++count;
        this.countCourses = count;
    }

    public int getCountCourses() {
        return countCourses;
    }
}
