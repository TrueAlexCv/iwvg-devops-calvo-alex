package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    private Searches searches;

    @BeforeEach
    void before() {
        searches = new Searches();
    }

    @Test
    void testFindUserIdByAllProperFraction() {
        List<String> expected = new ArrayList<>();
        assertEquals(expected, searches.findUserIdByAllProperFraction().toList());
    }
}