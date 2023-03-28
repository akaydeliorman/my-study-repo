public class Student {
    private String name;
    private String surname;
    private String idno;
    private String address;
    private int note;

    public Student(String name, String surname, String idno, String address,int note){
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.address = address;
        this.note = note;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getIdno(){
        return this.idno;
    }
    public void setIdno(String idno){
        this.idno = idno;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getNote(){
        if (note > 100 || note < 0){
            System.out.print("100 ve 0 değerleri arasında bir not giriniz !!");
            note = 0;
        }
        return this.note;
    }
    public void setNote(int note){
        if (note > 100 || note < 0){
            System.out.print("100 ile 0 değerleri arasında bir not giriniz !!");
        }
        this.note = note;
    }

}
