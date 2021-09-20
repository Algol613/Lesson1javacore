package lesson1.HomeWork01;

/**
 * Добавить класс Team, который будет содержать:
 * + название команды;
 * + массив из четырех участников — в конструкторе можно сразу всех участников указывать);
 * + метод для вывода информации о членах команды, прошедших дистанцию;
 * + метод вывода информации обо всех членах команды.
 */

public class Team {


    private final String teamName;
    private final int numberParticipants;
    private final int maxSkillObstacles;
    private Member[] membersTeam;


    Team(String name, int number, int obstacles) {
        this.teamName = name;
        this.numberParticipants = number;
        this.maxSkillObstacles = obstacles;

        TeamBuilding();

    }


    public void TeamBuilding() {
        membersTeam = new Member[numberParticipants];
        for (int i = 0; i < numberParticipants; i++) {
            membersTeam[i] = new Member(Tools.random.nextInt(maxSkillObstacles + maxSkillObstacles / 2));
        }

    }


    public void infoTeamPassedDistance() {
        System.out.println(" ★ Результаты ★ ");
        System.out.println("Препятствия прошли игроки: ");
        for (int i = 0; i < numberParticipants; i++) {
            if (membersTeam[i].getWinMember() == 1) {
                continue;
            }
            System.out.println("- игрок № " + membersTeam[i].getCountMember());
        }
    }


    public void infoTeam() {
        System.out.println(" ★ Состав команды ★ ");
        System.out.println("Количество игроков: " + membersTeam.length);

        for (int i = 0; i < numberParticipants; i++) {
            System.out.println("Игрок № " + membersTeam[i].getCountMember()
                    + ", может пройти " + membersTeam[i].getNumberOfObstacles() + " препятствий");
        }
    }


    public Member[] getMembersTeam() {
        return membersTeam;
    }

    public String getTeamName() {
        return teamName;
    }
}
