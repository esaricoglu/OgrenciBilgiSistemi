package OgrenciBilgiSistemi;

public class Course {
    String name;
    int code;
    String prefix;
    int note = 0;
    int quiz = 0;
    Teacher teacher;

    Course(String name, int code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmenin branşı ile ders uyuşmamaktadır.");
        }
    }

    void printTeacher() {
        System.out.println(this.name + " " + this.code + " dersini " + this.teacher.name + " vermektedir.");
        System.out.println(this.teacher.name + " adlı öğretmenin branşı : " + teacher.branch);
        System.out.println(this.teacher.name + " adlı öğretmenin telefon numarası : " + teacher.mpNo);
    }

}
