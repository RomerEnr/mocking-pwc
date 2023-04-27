package com.pwc.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void sum() {
    Calculator calculator = new Calculator();
    double actual = calculator.sum(2, 2);

    assertEquals(4, actual , "2 + 2 should equal 4");
  }
}