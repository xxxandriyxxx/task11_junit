package com.epam;

import com.epam.forTests.ForTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TryTest {

    private boolean condition = false;
    private static int count = 0;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("@BeforeAll: count = " + count);
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("@BeforeEach: count = " + count);
    }

    @AfterEach
    public void afterTest() {
        System.out.println("@AfterEach: count = " + count);
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("@AfterAll: count = " + count);
    }

    @DisplayName("super test")
    @Test
    public void testMethodAsd() {
        count++;
        System.out.println("TestMethodAsd works!");
    }

    @Test
    @Disabled
    public void testMethodQwe() {
        count++;
        System.out.println("TestMethodQwe works!");
    }

    @Test
    public void testMethodAssume() {
        count++;
        assumeTrue(condition);
        System.out.println("TestMethodAssume works!");
    }

    @Test
    public void testMethodAssert() {
        count++;
        assertTrue(condition);
        System.out.println("TestMethodAssert works!");
    }

    @Test
    public void testMethodFail() {
        count++;
        fail("Hello from fail!");
    }

    @Test
    public void testException() {
        count++;
        assertThrows(Exception.class, () -> ForTests.exceptionMethod(20));
    }

}
