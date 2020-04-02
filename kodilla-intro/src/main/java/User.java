public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User beata = new User("Beata", 33);
        User karol = new User("Karol", 58);
        User dawid = new User("Dawid", 13);
        User ewa = new User("Ewa", 18);


        User[] user = new User[5];
        user[0] = anna;
        user[1] = beata;
        user[2] = karol;
        user[3] = dawid;
        user[4] = ewa;

        int result = 0;
        for (int i = 0; i < user.length; i++) {
            result = result + user[i].getAge();
        }

        int averageResult = result/user.length;

        for (int i = 0; i < user.length; i++) {
            if (user[i].getAge() < averageResult){
               System.out.println(user[i].getName());
            }
        }

    }
}