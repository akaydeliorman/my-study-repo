import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Akay","Deliorman","123","AA",85);
        Student st2 = new Student("Mahmut","Ali","543","BB",85);
        Student st3 = new Student("Kod","Yaz","324","CC",85);

        Instructor teacher = new Instructor("Akay","Deliorman","CENG");

        Course mat = new Course("MAT101","MAT",teacher);

        System.out.println(mat.getInstructor().getName());
        /*Student[] stu = {st1,st2,st3};
        System.out.print("Ortalama : " + mat.calcAvarage(stu));*/

        /*st2.setNote(100);
        System.out.print(st2.getNote());*/
    }
}