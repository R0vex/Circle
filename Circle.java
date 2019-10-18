package sk.itsovy.ladislavracz.ProjectFragment;

public class Circle {
    private double r;
    private double d;
    private double C;


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }
    public Circle(double r, double d) {
        this.r = r;
        this.d = d;
    }
    public double calcRadius(){
        return d/2;
    }
    public double calcCircumference(){

        return 2*Math.PI*r;
    }
    public double calcDiameter(){
        return 2*r;
    }


}
