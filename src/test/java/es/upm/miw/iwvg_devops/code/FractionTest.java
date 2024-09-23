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
}
