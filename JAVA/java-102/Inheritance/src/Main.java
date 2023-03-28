public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Akay Deliorman","125465468486561","a@gmail.com");

        Academician a1 = new Academician("Ahmet Vel","452136441223","vel@gmail.com","IT","Academisyen");

        CivilServant s1 = new CivilServant("Batu","24121341234","b@gmail.com","IT2","09:00-12.00");

        Lecturer l1 = new Lecturer("Ahmet","2315123512","ahm@gmail.com","IT-3","Unvan","12");


        //Method Overloading
        //l1.login("10:00", "18:00");

        // Method Overriding
        //l1.login();

        // Polymorphism (Çok Biçimlilik) Override edilmiş methodlara erişebiliyoruz.
        //int [] loginUser = new int[5];
        Employee[] loginUser = {e1,a1,s1,l1};
        Employee.loginUser(loginUser);
        /*Employee s2 = new Academician("Ahmet Vel","452136441223","vel@gmail.com","IT","Academisyen");
        s2.login();*/
    }
}