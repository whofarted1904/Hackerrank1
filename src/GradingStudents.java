import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    private static List<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {

        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        grades.add(15);
        grades.add(78);

        System.out.println(grades);
        System.out.println(gradingStudents(grades));
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            if (grade >= 38 && grade % 5 > 2) {
                roundedGrades.add(grade + (5 - (grade % 5)));
            } else{
                roundedGrades.add(grade);
            }
        }
        return roundedGrades;
    }
}
