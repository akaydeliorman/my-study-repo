public class Teacher {
    String name;
    String num;
    String branch;

    Teacher(String name, String branch, String num){
        this.name = name;
        this.num = num;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı :" + this.name);
        System.out.println("Telefon Num :" + this.num);
        System.out.println("Bölümü :" + this.branch);
    }
}
