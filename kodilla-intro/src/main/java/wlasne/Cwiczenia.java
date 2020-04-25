package wlasne;

public class Cwiczenia {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        a = b = c * 1+2;
        System.out.println(a +"" + b + "" + c);

        a = b = c * (1+2);
        System.out.println(a +"" + b + "" + c);

        a = b ++;
        System.out.println(a +"" + b + "");

        c = --b ;
        System.out.println(a +"" + b + "");

        a++;
        b++;
        c++;
        System.out.println(a +" " + b + " " + c);
        System.out.println(a +" " + b + " " + c);

        c = 5;
        a = b++ * ++c;

        System.out.println(a +" " + b + " " + c);
    }
}
