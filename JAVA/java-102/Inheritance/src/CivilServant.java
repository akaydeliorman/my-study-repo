public class CivilServant extends Employee{
    private String departmant;
    private String shift;
    public CivilServant(String name,String phone,String mail, String departmant, String shift){
        super(name,phone,mail);
        this.departmant = departmant;
        this.shift = shift;
    }
    public String getDepartmant(){
        return this.departmant;
    }
    public void setDepartmant(String departmant){
        this.departmant = departmant;
    }
    public String getShift(){
        return this.shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }

    public void Work(){
        System.out.println(this.getName() + " memur görevini yapıyor !!");
    }
    @Override
    public void login(){
        System.out.println(this.getName() + " memur C kapısında giriş yaptı.");
    }
}
