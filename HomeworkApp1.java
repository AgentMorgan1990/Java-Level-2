package geekbrais.JavaLevel2.task1;

public class HomeworkApp1 {
    public static void main(String[] args) {

        OvercomeTheBoundary[] competitors = new OvercomeTheBoundary[3];

        Cat cat1 = new Cat(200, 5, "Барсик");
        Human human1 = new Human(1000, 2, "Иван");
        Robot robot1 = new Robot(5000, 10, "Электророник");

        competitors[0] = cat1;
        competitors[1] = human1;
        competitors[2] = robot1;

        Wall wall1 = new Wall(6, "Стена 1");
        Wall wall2 = new Wall(7, "Стена 2");
        RunningTrack runningTrack1 = new RunningTrack(150, "Дистанция 1");
        RunningTrack runningTrack2 = new RunningTrack(250, "Дистанция 2");

        Boundary[] boundary = new Boundary[4];
        boundary[0] = runningTrack1;
        boundary[1] = wall1;
        boundary[2] = runningTrack2;
        boundary[3] = wall2;

        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < boundary.length; j++) {
                competitors[i].overcomeTheBoundary(boundary[j]);
            }
        }


        Cat cat11 = new Cat(200, 5, "Барсик");
        Cat cat21 = new Cat(300, 10, "Мурка");
        Human human11 = new Human(1000, 2, "Иван");
        Robot robot11 = new Robot(5000, 10, "Электророник");

        Team team1 = new Team("Динамо", new OvercomeTheBoundary[]{cat11, human11, cat21, robot11});

        for (int i = 0; i < team1.teamMembers.length; i++) {
            for (int j = 0; j < boundary.length; j++) {
                team1.teamMembers[i].overcomeTheBoundary(boundary[j]);
            }
        }
        team1.showMembersCompletedDistance();
        team1.showAllMembers();

        Course corse1 = new Course(new Boundary[]{wall1, wall2, runningTrack1, runningTrack2});
        corse1.passObstacleCourse(team1.teamMembers);

    }
}
