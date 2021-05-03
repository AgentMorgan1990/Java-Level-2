package geekbrais.JavaLevel2.task1;

public class Human implements Ability, OvercomeTheBoundary {

    private int runningLength;
    private int jumpHeight;
    private String name;
    private boolean passedBoundary = true;

    public int getRunningLength() {

        return runningLength;
    }

    public void setRunningLength(int runningLength) {

        this.runningLength = runningLength;
    }

    public int getJumpHeight() {

        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {

        this.jumpHeight = jumpHeight;
    }

    public String showName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isPassedBoundary() {

        return passedBoundary;
    }

    public Human(int runningLength, int jumpHeight, String name) {
        this.runningLength = runningLength;
        this.jumpHeight = jumpHeight;
        this.name = name;

    }

    @Override
    public String jump() {
        return name + " готовится к прыжку и ";
    }

    @Override
    public String run() {
        return name + " начинает бежать и ";
    }

    public void overcomeTheBoundary(Boundary boundary) {
        if (passedBoundary == false) {
            System.out.println(this.name + " cнят с дистанции");
        } else {
            if (boundary.checkResult(this)) {
                passedBoundary = true;
            } else {
                passedBoundary = false;
            }
        }
    }
}
