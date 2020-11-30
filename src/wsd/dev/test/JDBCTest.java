package wsd.dev.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class JDBCTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCon() {
    }
    String wael="wael";
    @Test
    void getClassName() {
          assertFalse(wael.equals("wael "));
    }
}