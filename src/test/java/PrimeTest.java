import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    @Test
    void test2() {
        Assertions.assertTrue(new Prime().isPrime(2));
    }
    @Test
    void test3() {
        Assertions.assertTrue(new Prime().isPrime(3));
    }
    @Test
    void test4() {
        Assertions.assertTrue(new Prime().isPrime(4));
    }
    @Test
    void test5() {
        Assertions.assertTrue(new Prime().isPrime(5));
    }
    @Test
    void test6() {
        Assertions.assertTrue(new Prime().isPrime(6));
    }
}
