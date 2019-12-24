import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class letterGradeBoundaryTest {

    @Test
    public void forGradeX() {
        assertEquals('X', letterGrade.letterGrade(-1));
        assertEquals('X', letterGrade.letterGrade(101));
    }

    @Test
    public void forGradeF() {
        assertEquals('F', letterGrade.letterGrade(0));
        assertEquals('F', letterGrade.letterGrade(59));
    }

    @Test
    public void forGradeD() {
        assertEquals('D', letterGrade.letterGrade(60));
        assertEquals('D', letterGrade.letterGrade(69));
    }

    @Test
    public void forGradeC() {
        assertEquals('C', letterGrade.letterGrade(70));
        assertEquals('C', letterGrade.letterGrade(79));
    }

    @Test
    public void forGradeB() {
        assertEquals('B', letterGrade.letterGrade(80));
        assertEquals('B', letterGrade.letterGrade(89));
    }

    @Test
    public void forGradeA() {
        assertEquals('A', letterGrade.letterGrade(90));
        assertEquals('A', letterGrade.letterGrade(100));
    }
}