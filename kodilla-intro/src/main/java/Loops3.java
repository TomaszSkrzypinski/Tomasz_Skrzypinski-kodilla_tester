public class Loops3 {
    public static void main(String[] args) {

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        
        int numberOfElements = names.length;
        for (int i = numberOfElements-1; i >=0; i--) {
            System.out.println(names[i]);
        }

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }


}
