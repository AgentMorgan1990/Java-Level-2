package geekbrais.JavaLevel2.task1;

public class Wall extends Boundary {
    private int height;
    private String name;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Wall(int height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public boolean checkResult(Cat cat) {
        if (cat.getJumpHeight() > height) {
            System.out.println(cat.jump() + "перепрыгивает " + this.name);
            return true;
        } else {
            System.out.println(cat.jump() + "не перепрыгивает " + this.name);
            return false;

        }
    }

    public boolean checkResult(Robot robot) {
        if (robot.getJumpHeight() > height) {
            System.out.println(robot.jump() + "перепрыгивает " + this.name);
            return true;
        } else {
            System.out.println(robot.jump() + "не перепрыгивает " + this.name);
            return false;
        }
    }

    public boolean checkResult(Human human) {
        if (human.getJumpHeight() > height) {
            System.out.println(human.jump() + "перепрыгивает " + this.name);
            return true;
        } else {
            System.out.println(human.jump() + "не перепрыгивает " + this.name);
            return false;
        }
    }
}
