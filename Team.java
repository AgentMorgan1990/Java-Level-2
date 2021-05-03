package geekbrais.JavaLevel2.task1;

public class Team {
    String name;
    OvercomeTheBoundary[] teamMembers;
    public  Team (String name,OvercomeTheBoundary[] teamMembers) {
        this.name = name;
        this.teamMembers = teamMembers;
    }
    void showMembersCompletedDistance () {
        System.out.println("Имена участников, прошедших дистанцию: ");
        for (int i=0; i<teamMembers.length;i++){
            if (teamMembers[i].isPassedBoundary()){
                System.out.println(teamMembers[i].showName());
            }
        }
    }
    void showAllMembers () {
        System.out.println("Имена всех участников соревнования: ");
        for (int i=0; i<teamMembers.length;i++){
            System.out.println(teamMembers[i].showName());
        }
    }
}
