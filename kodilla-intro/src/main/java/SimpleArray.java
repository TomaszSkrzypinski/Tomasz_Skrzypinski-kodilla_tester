public class SimpleArray {
    public static void main(String[] args) {

        String[] animals = new String[5];
        animals[0] = "pies";
        animals[1] = "kot";
        animals[2] = "jeż";
        animals[3] = "bóbr";
        animals[4] = "jenot";

        String animal4 = animals[3];
        System.out.println(animal4);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");



    }
}
