package Ss4;

import java.util.Scanner;

public class XdlopQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.println("nhap vao b");
        double b=Double.parseDouble(scanner.nextLine());
        System.out.println("nhap vao c");
        double c=Double.parseDouble(scanner.nextLine());

        XdlopQ pt =new XdlopQ(a,b,c);
        pt.displayRoots();
    }
    private double a, b, c;

    public XdlopQ(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public void displayRoots() {
        if (getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép x = " + getRoot1());
        } else {
            System.out.println("Phương trình có hai nghiệm x1 = " + getRoot1() + ", x2 = " + getRoot2());
        }
    }
}
