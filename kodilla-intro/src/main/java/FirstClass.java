public class FirstClass {
        public static void main(String[] args) {

        Laptop computer = new Laptop(600, 1000, 2012);
        System.out.println(computer.weight + "g " + computer.price);
        computer.checkPrice();
        computer.checkWeight();
        computer.checkPricetAndYear();

        Laptop heavyComputer = new Laptop(2000, 1500, 2018);
        System.out.println(heavyComputer.weight + "g " + heavyComputer.price);
        heavyComputer.checkPrice();
        heavyComputer.checkWeight();
        heavyComputer.checkPricetAndYear();

        Laptop oldComputer = new Laptop(1200, 500, 2007);
        System.out.println(oldComputer.weight + "g " + oldComputer.price);
        oldComputer.checkPrice();
        oldComputer.checkWeight();
        oldComputer.checkPricetAndYear();

        int computerYear = oldComputer.getYear();
        System.out.println(computerYear);

        heavyComputer.displayPrice();


        LeapYear leapYear = new LeapYear(2000);
        leapYear.ifLeapYear();

}
        LeapYear2 leapYear2 = new LeapYear2(2101);


        public void ifLeapYear4() {
                if (leapYear2.ifLeapYear2() == false) {
                        System.out.println("Rok nieprzestępny");
                } else {
                        System.out.println("Rok przestępny");
                }
        }



        }
