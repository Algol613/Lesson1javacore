package lesson1.HomeWork01;
 public class main01 {

    public static void main(String[] args) {

        Team Team = new Team("Мурзики", 4, 4);
        System.out.println("Состав команды");
        System.out.println("Название: " + Team.getTeamName());
       System.out.println("Игроки ");
        Team.infoTeam();

        Course newCourse = new Course(4);
        newCourse.doIt(Team.getMembersTeam());
        Team.infoTeamPassedDistance();
    }

}