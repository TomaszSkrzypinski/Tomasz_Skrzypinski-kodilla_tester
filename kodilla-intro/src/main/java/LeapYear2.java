public class LeapYear2 {

    int year;

    public LeapYear2(int year) {
        this.year = year;
    }



    public boolean ifLeapYear2() {
        if (year%4 != 0) {
            System.out.println("Rok nieprzestępny");
            return false;
        } else if (year%400 == 0) {
            return true;
        } else if (year%100 == 0){
            System.out.println("Rok nieprzestępny");
            return false;
        } else {
            return true;
        }
    }

}
