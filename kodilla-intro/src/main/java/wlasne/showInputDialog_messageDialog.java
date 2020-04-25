package wlasne;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class showInputDialog_messageDialog {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
//        String name = showInputDialog("Podaj imię ");
//        String name1 = "Tomek";
//        if (name == null) name = "";
//        if (name.equals(name1)) {
//            showMessageDialog(null, "Witaj Tomaszu ");
//        }else{
//            showMessageDialog(null, "Witaj " + name);
//        }
//
//        String bokA = showInputDialog("Podaj bok a");
//        String bokB = showInputDialog("Podaj pok b");
//        int a = Integer.parseInt(bokA);
//        int b = Integer.parseInt(bokB);
//        int obwod = 2*(a + b);
//        int powierzchnia = a*b;
//
//        showMessageDialog(null, "Obwod wynosi " + obwod + ". Powirzchnia wynosi " + powierzchnia + "." );
            String zmienna = showInputDialog("Podaj 2 liczby całkowite rozdizleone spacjami.");
            if(zmienna != null) {
                Scanner scan = new Scanner(zmienna);
                int suma = scan.nextInt() + scan.nextInt() + scan.nextInt();
                showMessageDialog(null, "Suma: " + suma);
            }
    }
}