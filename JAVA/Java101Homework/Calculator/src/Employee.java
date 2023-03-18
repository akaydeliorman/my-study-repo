public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double increaseSalary;
    double initialSalary = salary;
/*
    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    toString() : Çalışana ait bilgileri ekrana bastıracaktır.*/
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void tax(){
        if(this.salary > 1000){
            this.salary -= salary * 0.03;
        }
    }
    void bonus(){
        if(workHours > 40){
            this.salary += (workHours - 40) * 30;
        }
    }
    void raiseSalary(){
        int workYear = 2021 - hireYear;
        if(workYear < 10){
            this.salary += salary * 0.05;
        } else if (workYear < 20) {
            this.salary += salary * 0.10;
        }else {
            this.salary += salary * 0.15;
        }
    }
    public void document(){
        this.tax();
        this.bonus();
        this.raiseSalary();

        System.out.println("===================" + "\n"
                + "Worker's name: " + this.name + "\n"
                + "Initial salary: " + this.salary + "\n"
                + "Work hours: " + this.workHours + "\n"
                + "Starting year: " + this.hireYear + "\n"
                + "Total salary: " + this.salary + "\n");
    }
}
