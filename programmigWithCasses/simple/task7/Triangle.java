package com.epam.programmigWithCasses.simple.task7;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/
public class Triangle {
    private double xA;
    private double yA;

    private double xB;
    private double yB;

    private double xC;
    private double yC;


    private double AB;
    private double BC;
    private double CA;

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
        this.xC = xC;
        this.yC = yC;

        this.AB = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
        System.out.println(" Сторона АВ равна - " + this.AB);
        this.BC = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
        System.out.println(" Сторона BC равна - " + this.BC);
        this.CA = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2));
        System.out.println(" Сторона CA равна - " + this.CA);
    }

    public double getxA() {
        return xA;
    }

    public void setxA(double xA) {
        this.xA = xA;
    }

    public double getyA() {
        return yA;
    }

    public void setyA(double yA) {
        this.yA = yA;
    }

    public double getxB() {
        return xB;
    }

    public void setxB(double xB) {
        this.xB = xB;
    }

    public double getyB() {
        return yB;
    }

    public void setyB(double yB) {
        this.yB = yB;
    }

    public double getxC() {
        return xC;
    }

    public void setxC(double xC) {
        this.xC = xC;
    }

    public double getyC() {
        return yC;
    }

    public void setyC(double yC) {
        this.yC = yC;
    }

    public double getAB() {
        return AB;
    }

    public void setAB(double AB) {
        this.AB = AB;
    }

    public double getBC() {
        return BC;
    }

    public void setBC(double BC) {
        this.BC = BC;
    }

    public double getCA() {
        return CA;
    }

    public void setCA(double CA) {
        this.CA = CA;
    }
}
