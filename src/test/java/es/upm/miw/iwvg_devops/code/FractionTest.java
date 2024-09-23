package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 5);
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testFractionIntInt() {
        fraction = new Fraction(2, 8);
        assertEquals(2, fraction.getNumerator());
        assertEquals(8, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.2, fraction.decimal());
    }

    @Test
    void testIsProper() {
        assertEquals(true, fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertEquals(false, fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        assertEquals(true, fraction.isEquivalent(new Fraction(2, 10)));
    }

    @Test
    void testAdd() {
        Fraction sumResult = fraction.add(new Fraction(2, 10));
        assertEquals(2, sumResult.getNumerator());
        assertEquals(5, sumResult.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction multiplyResult = fraction.multiply(new Fraction(7, 3));
        assertEquals(7, multiplyResult.getNumerator());
        assertEquals(15, multiplyResult.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction divideResult = fraction.divide(new Fraction(6, 8));
        assertEquals(4, divideResult.getNumerator());
        assertEquals(15, divideResult.getDenominator());
    }
}
