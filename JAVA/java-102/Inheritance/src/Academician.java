public class Academician extends Employee{
    private String department;
    private String title;
    public Academician(String name, String phone, String mail, String department, String title){
        super(name,phone,mail);
        this.department = department;
        this.title = title;
    }

    public String getSection(){
        return this.department;
    }
    public void setSection(String section){
        this.department = section;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(){
        this.title = title;
    }
    public void attendClass(){
        System.out.println(this.getName() + " derse girdi !!");
    }
    @Override
    public void login(){
        System.out.println(this.getName() + " akademisyeni A kapısında giriş yaptı.");
    }
}
