package com.pwc.dominio;

public class ComputerSpecialist implements Operational {
  private final Calculator calculator;
  private String name;

  public ComputerSpecialist(Calculator calculator, String name) {
    this.calculator = calculator;
    this.name = name;
  }

  @Override
  public double sum(double a, double b) {
    return calculator.sum(a, b);
  }
}
