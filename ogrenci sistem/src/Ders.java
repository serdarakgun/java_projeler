public class Ders {
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    Ogretmen teacher;

    //constructor
    Ders(String name,String code, String prefix){
    this.name=name;
    this.code=code;
    this.prefix=prefix;
    this.note=101;
    this.sozlu=101;

    }

    void addTeacher(Ogretmen t){
        if(this.prefix.equals(t.branch)){
            this.teacher=t;
            System.out.println("işlem başarılı");
        }
        else{

            System.out.println(t.name+" adlı öğretmen bu dersi veremez");
        }

    }
    void printTeacher(){
        System.out.println(this.name+" dersinin hocası: "+this.teacher.name);
    }
}
