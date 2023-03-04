package Phuong_Trinh_Bac_2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    public void setA(double a) {
//        this.a = a;
//    }
//
//    public void setC(double c) {
//        this.c = c;
//    }
//
//    public void setB(double b) {
//        this.b = b;
//    }

    public double getDiscriminant() {
        double delta = (this.b * this.b) - (4 * this.a * this.c);
        return delta;
    }

    public double getRoot1() {
        double r1 = ((-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a));
        return r1;
    }

    public double getRoot2() {
        double r2 = ((-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a));
        return r2;
    }

    public void getRoot() {
        if (getDiscriminant() > 0) {
//            getRoot1();
            System.out.println("nghiệm thứ 1 là:" + getRoot1());
            System.out.println("nghiệm thứ 1 là:" + getRoot2());

//            getRoot2();
        } else if (getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép: " + (-this.b) / (2 * this.a));
        } else {
            System.out.println("Phương trình vô nghiệm!!");
        }
    }

    public String display() {
        return " a = " + a + " ; b = " + b + " ; c = " + c + "";
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
