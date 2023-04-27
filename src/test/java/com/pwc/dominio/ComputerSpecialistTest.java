package com.pwc.dominio;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ComputerSpecialistTest {

  @Test
  public void computerSpecialistSumTwoNumbers() {
    Calculator calculator = Mockito.mock(Calculator.class);
    when(calculator.sum(2, 2)).thenReturn(4.0);

    ComputerSpecialist specialist = new ComputerSpecialist(calculator, "John");
    assertEquals(4, specialist.sum(2, 2), "2 + 2 should equal 4");
  }

}