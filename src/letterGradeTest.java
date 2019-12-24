import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class letterGradeTest {

    @Test
    public void forGradeX() {
        assertEquals('X', letterGrade.letterGrade(-3));
        assertEquals('X', letterGrade.letterGrade(103));
    }

    @Test
    public void forGradeF() {
        assertEquals('F', letterGrade.letterGrade(33));
    }

    @Test
    public void forGradeD() {
        assertEquals('D', letterGrade.letterGrade(63));
    }

    @Test
    public void forGradeC() {
        assertEquals('C', letterGrade.letterGrade(73));
    }

    @Test
    public void forGradeB() {
        assertEquals('B', letterGrade.letterGrade(83));
    }

    @Test
    public void forGradeA() {
        assertEquals('A', letterGrade.letterGrade(93));
    }
}