package com.epam.programmigWithCasses.simple.task7;

public class TriangleLogic {


    public TriangleLogic() {
    }

    public double calcSquare(Triangle triangle) {
        double pp = (triangle.getAB() + triangle.getBC() + triangle.getCA()) / 2;
        return Math.sqrt(pp * ((pp - triangle.getAB() * (pp - triangle.getBC()) * (pp - triangle.getCA()))));
    }

    public double calcPerimeter(Triangle triangle) {
        return triangle.getAB() + triangle.getBC() + triangle.getCA();
    }

    public double[] medianCoordinates(Triangle triangle) {
        double[] result = new double[2];
        result[0] = (triangle.getxA() + triangle.getxB() + triangle.getxC()) / 3;
        result[1] = (triangle.getyA() + triangle.getyB() + triangle.getyC()) / 3;
        return result;
    }
}
