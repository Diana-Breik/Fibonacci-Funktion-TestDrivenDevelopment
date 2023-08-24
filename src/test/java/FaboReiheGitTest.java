import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FaboReiheGitTest {

    @Test
    void fibonacci_Position0() {
        //GIVEN
        int n = 0;

        //WHEN
        int actual = FaboReiheGit.fibonacci(n);

        //THEN
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }


    @Test
    void fibonacci_Position1() {
        //GIVEN
        int n = 1;

        //WHEN
        int actual = FaboReiheGit.fibonacci(n);

        //THEN
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void fibonacci_Position2() {
        //GIVEN
        int n = 2;

        //WHEN
        int actual = FaboReiheGit.fibonacci(n);

        //THEN
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void fibonacci_Position3() {
        //GIVEN
        int n = 3;

        //WHEN
        int actual = FaboReiheGit.fibonacci(n);

        //THEN
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void fibnoacci_Position5(){
        //GIVEN
        int n=5;

        //WHEN
        int actual= FaboReiheGit.fibonacci(n);

        //THEN
        int expected= 5;
        Assertions.assertEquals(expected,actual);


    }


    @Test
    void ffibonacci_Position20()
    {
        //GIVEN
        int n = 20;

        int actual = FaboReiheGit.fibonacci(n);

        //THEN
        int expected = 6765;
        Assertions.assertEquals(expected, actual);

    }
}