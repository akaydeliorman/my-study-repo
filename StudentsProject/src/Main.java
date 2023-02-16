public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Akay Hoca","TRH","555");
        Teacher t2 = new Teacher("Nur Hoca","FZK","000");
        Teacher t3 = new Teacher("F Hoca","BIO","111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Fatma","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,70,50);
        s1.isPass();

        Student s2 = new Student("Akay","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(78,56,30);
        s1.isPass();
    }
}