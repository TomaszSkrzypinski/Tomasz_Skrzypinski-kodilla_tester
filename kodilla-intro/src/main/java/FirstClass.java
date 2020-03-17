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


    }
}
