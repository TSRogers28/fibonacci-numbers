package FibonacciFactoryTest;

import com.company.FibonacciFactory.FibonacciFactory;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FibonacciFactoryTest {
    FibonacciFactory fibonacciFactory;

    @Test
    public void getFibonacciNumbers() {
        fibonacciFactory = new FibonacciFactory(13);

        BigInteger [] expected = {new BigInteger("0"),new BigInteger("1"),new BigInteger("1"), new BigInteger("2"),
                new BigInteger("3"), new BigInteger("5"), new BigInteger("8"), new BigInteger("13"),
                new BigInteger("21"), new BigInteger("34"), new BigInteger("55"), new BigInteger("89"), new BigInteger("144")};

        BigInteger[] actual = fibonacciFactory.getFibonacciNumbers();

        assertEquals(expected, actual);
    }

    @Test
    public void getCertainFibonacciNumber() {
        BigInteger expected = new BigInteger("144");
        BigInteger actual = FibonacciFactory.getCertainFibonacciNumber(13);

        assertEquals(expected, actual);
    }

    @Test
    public void getCertainFibonacciNumberBigNumber() {
        BigInteger expected = new BigInteger("218922995834555169026");
        BigInteger actual = FibonacciFactory.getCertainFibonacciNumber(100);
        assertEquals(expected, actual);
    }

    @Test
    public void getCertainFibonacciNumberWithNoArray() {
        BigInteger expected = new BigInteger("144");
        BigInteger actual = FibonacciFactory.getCertainFibonacciNumberWithNoArray(13);
        assertEquals(expected, actual);

    }

    @Test
    public void getCertainFibonacciNumberWithNoArrayBigNumber() {
        BigInteger expected = new BigInteger("218922995834555169026");
        BigInteger actual = FibonacciFactory.getCertainFibonacciNumberWithNoArray(100);
        assertEquals(expected, actual);

    }
}