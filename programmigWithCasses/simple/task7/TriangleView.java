package com.epam.programmigWithCasses.simple.task7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TriangleView {
    TriangleLogic triangleLogic = new TriangleLogic();

    public TriangleView() {
    }

    public void printTriangleSquare(Triangle triangle) {
        System.out.println("Площадь треугольника:" + triangleLogic.calcSquare(triangle));
    }

    public void printTrianglePerimeter(Triangle triangle) {
        System.out.println("Периметр треугольника:" + triangleLogic.calcPerimeter(triangle));
    }

    public void printMedianCoordinates(Triangle triangle) {
        System.out.printf("Точка пересечения медиан треугольника: %s", Arrays.toString(triangleLogic.medianCoordinates(triangle)));
    }
}