package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;
    private Fraction fraction;
    List<Fraction> fractions;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 3);
        fractions = new ArrayList<>();
        fractions.add(fraction);
        user = new User("1", "Usuario1", "Familia1", fractions);
    }

    @Test
    void testUser() {
        user = new User();
        fractions = new ArrayList<>();
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void testUserValues() {
        assertEquals("1", user.getId());
        assertEquals("Usuario1", user.getName());
        assertEquals("Familia1", user.getFamilyName());
        assertEquals(fractions, user.getFractions());
    }


    @Test
    void testSetName() {
        user.setName("Alex");
        assertEquals("Alex", user.getName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Calvo");
        assertEquals("Calvo", user.getFamilyName());
    }

    @Test
    void testSetFractions() {
        fractions.add(new Fraction(1, 9));
        user.setFractions(fractions);
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void testAddFraction() {
        Fraction fraction = new Fraction(1, 4);
        fractions.add(fraction);
        user.addFraction(fraction);
        assertEquals(fractions, user.getFractions());
        assertEquals(fractions.size(), user.getFractions().size());
    }

    @Test
    void testFullName() {
        assertEquals("Usuario1 Familia1", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("U.", user.initials());
    }
}
