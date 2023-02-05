package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        // ÖĞRETMENLER
        Teacher t1 = new Teacher("Fazıl Say", "0530", "MZK");
        Teacher t2 = new Teacher("Cahit Arf", "0531", "MAT");
        Teacher t3 = new Teacher("Alber Enistein", "0532", "FZK");

        // DERSLER
        Course mzk = new Course("Müzik", 101, "MZK");
        mzk.addTeacher(t1);
        // mzk.printTeacher();

        Course mat1 = new Course("Matematik", 101, "MAT");
        mat1.addTeacher(t2);
        //mat1.printTeacher();

        Course fzk1 = new Course("Fizik", 101, "FZK");
        fzk1.addTeacher(t3);
        // fzk1.printTeacher();

        Course mat2 = new Course("Matematik", 102, "MAT");
        mat2.addTeacher(t2);
        //mat2.printTeacher();

        Course fzk2 = new Course("Fizik", 102, "FZK");
        fzk2.addTeacher(t3);
        //fzk2.printTeacher();

        // ÖĞRENCİLER
        Student s1 = new Student("Emin", 129, 4, mat2, mzk, fzk2);
        s1.addBulkExamNotes(80, 50, 70, 65, 40, 85);
        s1.printNote();
        s1.calcAvarage();
        s1.isPass();


        Student s2 = new Student("Zafer", 236, 2, mat1, fzk1, mzk);
        s2.addBulkExamNotes(50, 60, 40, 80, 70, 55);
        s2.printNote();
        s2.calcAvarage();
        s2.isPass();

        Student s3 = new Student("Yiğit", 273, 4, mat2, fzk1, fzk2);
        s3.addBulkExamNotes(40,20,30,70,60,45);
        s3.printNote();
        s3.calcAvarage();
        s3.isPass();
    }
}
