package wlasne;

import static javax.swing.JOptionPane.*;

public class Cwiczenia2 {

    private double a, b, c;

    public Cwiczenia2(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    double sum() {
        return a + b + c;
    }

    double average() {
        return (a + b + c) / 3;
    }

    void increase() {
        a++;
        b++;
        c++;
    }

    void report() {
        System.out.println("Suma " + sum());
        System.out.println("Srednia " + average());
    }

    public static void main(String[] args) {

        double a = 12, b = 14, c = 4;

        Cwiczenia2 d = new Cwiczenia2(7, 15, 3);

        d.report();
        d.increase();
        d.report();
        d.increase();
        d.report();
    }

    String name = showInputDialog("podaj imię");

}

