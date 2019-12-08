package com.epam.other;

import com.epam.forTests.Calculator;
import com.epam.forTests.MathApp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MathAppTestWithMockito {
    @InjectMocks
    MathApp mathApp;

    @Mock
    Calculator calculator;

    @Test
    public void testAdd() {
        when(calculator.add(10, 40)).thenReturn(50);
        assertEquals(mathApp.add(10, 40), 50);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = Mockito.mock(Calculator.class);
        MathApp mathApp = new MathApp(calculator);
        when(calculator.multiply(3, 5)).thenReturn(15);
        assertEquals(mathApp.multiply(3, 5), 15);
    }

    @Test
    public void testSubtract() {
        when(calculator.subtract(30, 5)).thenReturn(25);
        assertEquals(mathApp.subtract(30, 5), 25);
        verify(calculator).subtract(30, 5);
    }

}
