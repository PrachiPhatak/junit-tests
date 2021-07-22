import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId() {
        return id;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : grades) {
            total = total + grade;
        }
        return total / grades.size();
    }

    public void updateGrade(int newGrade) {
        Collections.sort(grades);
        if (grades.size() > 0)
            grades.set(0, newGrade);
    }

    public void deleteGrade() {
        Collections.sort(grades);
        if (grades.size() > 0)
            grades.remove(0);
    }

}
