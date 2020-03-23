public class FirstClass {
       public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 950, 2017);
        System.out.println(notebook.weight + "g" + " " + notebook.price + " " + notebook.year + "r");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1100, 2014);
        System.out.println(heavyNotebook.weight + "g" + " " + heavyNotebook.price + " " + heavyNotebook.year + "r");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 550, 2009);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price + " " + oldNotebook.year + "r");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        int notebookWeight = heavyNotebook.getWeight();
        System.out.println(notebookWeight);

        // Poniżej kod po zmianach
        System.out.println(" ");
        System.out.println(" ");
           System.out.println("Po zmianach:");

        laptop komputer = new laptop(600,1000, 2012);
        System.out.println(komputer.weight +"g " + komputer.price);
        komputer.checkPrice();
        komputer.checkWeight();
        komputer.checkWeightAndYear();

        laptop heavyKomputer = new laptop(2000, 1500, 2018);
        System.out.println(heavyKomputer.weight +"g " + heavyKomputer.price);
        heavyKomputer.checkPrice();
        heavyKomputer.checkWeight();
        heavyKomputer.checkWeightAndYear();

        laptop oldKomputer = new laptop(1200, 500, 2007);
        System.out.println(oldKomputer.weight +"g " + oldKomputer.price);
        oldKomputer.checkPrice();
        oldKomputer.checkWeight();
        oldKomputer.checkWeightAndYear();



    }

}
