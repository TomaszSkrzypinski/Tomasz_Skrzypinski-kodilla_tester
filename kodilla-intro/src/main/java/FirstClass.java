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


        // Poniżej kod po zmianach
        System.out.println();
        System.out.println();
           System.out.println("Po zmianach:");

        Laptop computer = new Laptop(600,1000, 2012);
        System.out.println(computer.weight +"g " + computer.price);
        computer.checkPrice();
        computer.checkWeight();
        computer.checkWeightAndYear();

        Laptop heavyComputer = new Laptop(2000, 1500, 2018);
        System.out.println(heavyComputer.weight +"g " + heavyComputer.price);
        heavyComputer.checkPrice();
        heavyComputer.checkWeight();
        heavyComputer.checkWeightAndYear();

        Laptop oldComputer = new Laptop(1200, 500, 2007);
        System.out.println(oldComputer.weight +"g " + oldComputer.price);
        oldComputer.checkPrice();
        oldComputer.checkWeight();
        oldComputer.checkWeightAndYear();

        int computerYear = oldComputer.getYear();
        System.out.println(computerYear);

       heavyComputer.displayPrice();






       }

}
