package com.epam.programmigWithCasses.simple.task7;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(0, 0, 2, 2, 5, 5);
        TriangleView triangleView = new TriangleView();
        triangleView.printTriangleSquare(triangle);
        triangleView.printTrianglePerimeter(triangle);
        triangleView.printMedianCoordinates(triangle);
    }
}
