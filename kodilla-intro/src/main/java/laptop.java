public class laptop {

    int weight;
    int price;
    int year;

    public laptop(int weight, int price, int year) {

     this.weight=weight;
     this.price=price;
     this.year=year;
    }

    public void checkPrice(){
        if(this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        }

        else {
            System.out.println("This notebook is  expensive.");
        }

    }

    public void checkWeight(){
        if(this.weight < 1000) {
            System.out.println("This notebook is light.");
        }
        else if (this.weight >= 1000 && this.weight <= 1500) {
            System.out.println("This notebook is not heavy.");
        }

        else {
            System.out.println("This notebook is heavy.");
        }

    }


    public void checkWeightAndYear(){
        if(this.weight < 1000 && this.year <= 2015) {
            System.out.println("This notebook is light and old.");
        }
        else if(this.weight < 1000 && this.year > 2015) {
            System.out.println("This notebook is light and new.");
        }
        else if (this.weight >= 1000 && this.weight <= 1500 && this.year <= 2015) {
            System.out.println("This notebook is not heavy and old.");
        }
        else if (this.weight >= 1000 && this.weight <= 1500 && this.year > 2015) {
            System.out.println("This notebook is not heavy and new.");
        }
        else if (this.weight > 1500 && this.year <= 2015) {
            System.out.println("This notebook is heavy and new.");
        }
        else {
            System.out.println("This notebook is heavy and new.");
        }

    }


}
