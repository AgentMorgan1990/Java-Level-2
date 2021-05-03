package geekbrais.JavaLevel2.task1;

public class RunningTrack extends Boundary {

    private int length;
    private String name;

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public RunningTrack(int size, String name) {
        this.length = size;
        this.name = name;
    }

    @Override
    public boolean checkResult(Cat cat) {
        if (cat.getRunningLength() > length) {
            System.out.println(cat.run() + "пробегает " + this.name);
            return true;
        } else {
            System.out.println(cat.run() + "не пробегает " + this.name);
            return false;
        }
    }

    public boolean checkResult(Robot robot) {
        if (robot.getRunningLength() > length) {
            System.out.println(robot.run() + "пробегает " + this.name);
            return true;
        } else {
            System.out.println(robot.run() + "не пробегает " + this.name);
            return false;
        }
    }

    public boolean checkResult(Human human) {
        if (human.getRunningLength() > length) {
            System.out.println(human.run() + "пробегает " + this.name);
            return true;
        } else {
            System.out.println(human.run() + "не пробегает " + this.name);
            return false;
        }
    }
}
