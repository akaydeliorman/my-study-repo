public class Lecturer extends Academician{
    private String doorNo;
    public Lecturer(String name, String phone, String mail, String department, String title,String doorNo){
        super(name,phone,mail,department,title);
        this.doorNo = doorNo;
    }
    public String getDoorNo(){
        return this.doorNo;
    }
    public void setDoorNo(String doorNo){
        this.doorNo = doorNo;
    }

    @Override
    public void login(){
        System.out.println(this.getName() + " öğretim görevlisi B kapısında giriş yaptı.");
    }
}
