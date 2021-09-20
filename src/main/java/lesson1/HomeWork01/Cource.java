package lesson1.HomeWork01;

/**
 * Класс полоса препятствий
 * 3. Добавить класс Course (полоса препятствий), в котором будут находиться:
 * + массив препятствий;
 * + метод, который будет просить команду пройти всю полосу.
 */

class Course {

    private final int numberCourses;
    private Obstacles[] arrayObstacles;


    public Course(int number) {
        this.numberCourses = number;
        obstaclesInstallation();
        infoCourse();
    }

    public void obstaclesInstallation() {
        arrayObstacles = new Obstacles[numberCourses];
        for (int i = 0; i < numberCourses; i++) arrayObstacles[i] = new Obstacles(i + 1);
    }

    public void infoCourse() {
        System.out.println(" ★  Полоса препятствий  ★ ");
        System.out.println("Количество препятствий: " + arrayObstacles.length);

        for (int i = 0; i < numberCourses; i++) {
            System.out.println("Препятствие № " + arrayObstacles[i].getCountCourses());
        }
    }

    public void doIt(Member[] team) {
        System.out.println(" ★ Соревнования ★ ");
        for (Member member : team) {
            for (int j = 0; j < arrayObstacles.length; j++) {
                if (member.goObstacles(j)) System.out.println("Игрок № " + member.getCountMember()
                        + " прошел " + member.countObstacles(j + 1) + " препятствий");
            }

        }
    }
}