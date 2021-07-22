import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student(12, "Prachi");
        student.addGrade(90);
    }

    @Test
    public void testGetIDReturnsLong() {
        assertEquals(12, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Prachi", student.getName());
    }

    @Test
    public void testAddGrade() {
        assertEquals(1, student.getGrades().size());

        student.addGrade(100);
        student.addGrade(100);
        student.addGrade(100);
        assertEquals(4, student.getGrades().size());
    }

    @Test
    public void testGetGradeAvg() {
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(100);

        assertEquals(90.0, student.getGradeAverage());
    }

    @Test
    public void testGetGrades() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        assertEquals(grades, student.getGrades());
    }

    @Test
    public void testDeleteGrades_arrayOf3_returnArrayOf2() {
        student = new Student(12, "Prachi");
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(100);
        ArrayList<Integer> expectedGrades = new ArrayList<>();
        expectedGrades.add(90);
        expectedGrades.add(100);

        student.deleteGrade();
        assertEquals(2, student.getGrades().size());
        assertEquals(expectedGrades, student.getGrades());
    }

    @Test
    public void testDeleteGrades_null_return0() {
        student = new Student(12, "Prachi");

        student.deleteGrade();
        assertEquals(0, student.getGrades().size());
    }
    @Test
    public void testDeleteGrades_arrayOfOneGrade_return0() {
        student = new Student(12, "Prachi");
        student.addGrade(90);

        student.deleteGrade();
        assertEquals(0, student.getGrades().size());
    }

    @Test
    public void testDeleteGrades_arrayOf3SameGrades_returnArrayOf2() {
        student = new Student(12, "Prachi");
        student.addGrade(90);
        student.addGrade(90);
        student.addGrade(90);

        student.deleteGrade();
        assertEquals(2, student.getGrades().size());
    }



    @Test
    public void testUpdateGrades_arrayOfOneGrade_return0() {
        student = new Student(12, "Prachi");
        student.addGrade(90);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(99);

        student.updateGrade(99);

        assertEquals(1, student.getGrades().size());
        assertEquals(grades, student.getGrades());
    }

    @Test
    public void testUpdateGrades_arrayOfTwoSameGrade_return0() {
        student = new Student(12, "Prachi");
        student.addGrade(90);
        student.addGrade(90);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(99);
        grades.add(90);

        student.updateGrade(99);

        assertEquals(2, student.getGrades().size());
        assertEquals(grades, student.getGrades());
    }


}
