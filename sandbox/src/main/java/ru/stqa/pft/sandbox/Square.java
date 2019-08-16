package ru.stqa.pft.sandbox;

/**
 * Created by user on 001 01.08.19.
 */
public class Square {

  public double l;


  public Square(double l) {
    this.l = l;
  }

  public double area() {
    return this.l * this.l;
  }

}