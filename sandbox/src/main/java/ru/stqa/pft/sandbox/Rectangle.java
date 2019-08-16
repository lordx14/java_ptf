package ru.stqa.pft.sandbox;

/**
 * Created by user on 001 01.08.19.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {

    return this.a * this.b;
  }

}