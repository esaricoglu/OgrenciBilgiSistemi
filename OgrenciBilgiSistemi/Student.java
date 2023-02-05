package OgrenciBilgiSistemi;

public class Student {
    String name;
    int stuNo;
    int classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    Student(String name, int stuNo, int classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    void addBulkExamNotes(int c1Note, int c1Quiz, int c2Note, int c2Quiz, int c3Note, int c3Quiz) {
        if (c1Note >= 0 && c1Note <= 100) {
            this.c1.note = c1Note;
        }
        if (c1Quiz >= 0 && c1Quiz <= 100) {
            this.c1.quiz = c1Quiz;
        }
        if (c2Note >= 0 && c2Note <= 100) {
            this.c2.note = c2Note;
        }
        if (c2Quiz >= 0 && c2Quiz <= 100) {
            this.c2.quiz = c2Quiz;
        }
        if (c3Note >= 0 && c3Note <= 100) {
            this.c3.note = c3Note;
        }
        if (c3Quiz >= 0 && c3Quiz <= 100) {
            this.c3.quiz = c3Quiz;
        }
    }

    void printNote() {
        System.out.println(this.name + " adlı öğrencinin " + this.c1.name + " " + this.c1.code + " dersinden aldığı sınav notu : " + this.c1.note);
        System.out.println(this.name + " adlı öğrencinin " + this.c1.name + " " + this.c1.code + " dersinden aldığı sözlü notu : " + this.c1.quiz);


        System.out.println(this.name + " adlı öğrencinin " + this.c2.name + " " + this.c2.code + " dersinden aldığı sınav notu : " + this.c2.note);
        System.out.println(this.name + " adlı öğrencinin " + this.c2.name + " " + this.c2.code + " dersinden aldığı sözlü notu : " + this.c2.quiz);


        System.out.println(this.name + " adlı öğrencinin " + this.c3.name + " " + this.c3.code + " dersinden aldığı sınav notu : " + this.c3.note);
        System.out.println(this.name + " adlı öğrencinin " + this.c3.name + " " + this.c3.code + " dersinden aldığı sözlü notu : " + this.c3.quiz);

    }

    void calcAvarage() {
        double avarage1 = (this.c1.note*0.80) + (this.c1.quiz * 0.20);
        System.out.println(this.name + " adlı öğrencinin " + this.c1.name + " " + this.c1.code + " dersi ortalaması : " + avarage1);
        double avarage2 = (this.c2.note*0.80) + ( this.c2.quiz * 0.20);
        System.out.println(this.name + " adlı öğrencinin " + this.c2.name + " " + this.c2.code + " dersi ortalaması : " + avarage2);
        double avarage3 = (this.c3.note*0.80) + (this.c3.quiz*0.20);
        System.out.println(this.name + " adlı öğrencinin " + this.c3.name + " " + this.c3.code + " dersi ortalaması : " + avarage3);

        this.avarage = (avarage1 + avarage2 + avarage3) / 3.0;
        if(this.avarage >=55){
            this.isPass = true;
        }else{
            this.isPass = false;
        }
        System.out.println(this.name + " adlı öğrencinin genel ortalaması : "+ this.avarage);
    }

    void isPass() {
        if (isPass == true) {
            System.out.println(this.name + " sınıfı geçti !");
        } else {
            System.out.println(this.name + " sınıfta kaldı !");
        }
    }
}
