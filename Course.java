package geekbrais.JavaLevel2.task1;

public class Course {
    Boundary[] obstacleСourse;
    public Course (Boundary[] obstacleСourse){
        this.obstacleСourse = obstacleСourse;
    }
    void passObstacleCourse (OvercomeTheBoundary[] competitors){

        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < obstacleСourse.length; j++) {
                competitors[i].overcomeTheBoundary(obstacleСourse[j]);
            }
        }
    }

}
