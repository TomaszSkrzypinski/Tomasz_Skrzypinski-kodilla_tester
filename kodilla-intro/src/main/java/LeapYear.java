public class LeapYear {


    int year;

    public LeapYear( int year) {

        this.year = year;

    }


    public void leapYear () {
            if (this.year%4 != 0) {
                System.out.println("Rok nieprzestępny");
            } else if (this.year%400 == 0) {
                System.out.println("Rok przestępny");
            } else if (this.year%100 == 0){
                System.out.println("Rok nieprzestępny");
            } else {
                System.out.println("Rok przestępny");
            }
    }
}
