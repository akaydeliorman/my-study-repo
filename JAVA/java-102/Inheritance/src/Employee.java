public class Employee {
    private String name;
    private String phone;
    private String mail;

    public Employee (String name, String phone, String mail){
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getMail(){
        return this.mail;
    }
    public void setMail(String mail){
        this.mail = mail;
    }

    public void login(){
        System.out.println(this.name + " Üniversiteye giriş yaptı !!");
    }
    // Overloading metodu
    /*public void login(String time){
        System.out.println(this.name + " " + time + " Üniversiteye giriş yaptı !!");
    }
    public void login(String time, String leftime){
        System.out.println(this.name + " " + time + "Üniversiteye giriş yaptı !!" + leftime + " çıkış yaptı");
    }*/
    //----
    public void exit(){
        System.out.println(this.name + " Üniversiteden çıkış yaptı !!");
    }
    public void diningHall(){
        System.out.println(this.name + " Yemekhaneye girdi !!");
    }

    // Polymorphism
    public static void loginUser(Employee[] login_Users){
        for (Employee e :login_Users){
            // e1.login();
            // a1.login();
            e.login();
        }
    }
}
