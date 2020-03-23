public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year=year;

    }

    public void checkPrice() {
        if(this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }else if(this.price >= 600 && this.price <=1000 ) {
            System.out.println("This price is good.");
        }else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if(this.weight < 1000) {
            System.out.println("This notebook is light.");
        }else if(this.weight > 1000 && this.weight <2000) {
            System.out.println("This notebook is not too heavy.");
        }else {
            System.out.println("This notebook very heavy.");
        }
    }

    public void checkYear() {
        if(this.year < 2010) {
            System.out.println("This notebook is old.");
        }else if(this.year >= 2010 && this.year <2015) {
            System.out.println("This notebook is not too old.");
        }else {
            System.out.println("This notebook new.");

        }
    }
    public int getWeight() {
        return this.weight;
    }

}