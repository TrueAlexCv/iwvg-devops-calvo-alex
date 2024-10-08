package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void testSetNumerator() {
        fraction.setNumerator(2);
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(10);
        assertEquals(10, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.2, fraction.decimal());
    }

    @Test
    void testIsProper() {
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertFalse(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        assertTrue(fraction.isEquivalent(new Fraction(2, 10)));
    }

    @Test
    void testIsEquivalentFalse() {
        assertFalse(fraction.isEquivalent(new Fraction(3, 11)));
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
