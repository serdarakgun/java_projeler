public class Ogrenci {
    String name;
    String stuNo;
    int classes;
    Ders mat;
    Ders fizik;
    Ders kimya;
    double avg;
    boolean isPass;

    //constructor
    Ogrenci(String name, int classes, String stuNo, Ders mat,Ders fizik,Ders kimya){
        this.name=name;
        this.classes=classes;
        this.stuNo=stuNo;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calcavg();
        this.isPass=false;

    }
    //methods
    public void calcavg(){
        this.avg=(this.mat.note*0.8+this.mat.sozlu*0.2+this.fizik.note*0.8+this.fizik.sozlu*0.2+this.kimya.note*0.8+this.kimya.sozlu*0.2)/3;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat>=0 && mat<=100){
            this.mat.note=mat;
        }
        if(fizik>=0 && fizik<=100){
            this.fizik.note=fizik;
        }
        if(kimya>=0 && kimya<=100){
            this.kimya.note=kimya;
        }
        calcavg();
    }public void sozlu(int mat, int fizik, int kimya){
        if(mat>=0 && mat<=100){
            this.mat.sozlu=mat;
        }
        if(fizik>=0 && fizik<=100){
            this.fizik.sozlu=fizik;
        }
        if(kimya>=0 && kimya<=100){
            this.kimya.sozlu=kimya;
        }
        calcavg();
    }
    public void isPass() {
        if(this.mat.note==101 || this.fizik.note==101 || this.kimya.note==101){
            System.out.print("Eksik Not Girildi!");
        }
        else if(this.mat.sozlu==101 || this.fizik.sozlu==101 || this.kimya.sozlu==101){

            System.out.print("Sözlüler eksik girildi");
        }
        else {
            System.out.print("Ortalama: " + this.avg);
            if (this.avg > 55) {
                System.out.println("     Sınıf Geçildi");
            } else {
                System.out.println("     Sınıf geçilemedi");
            }
        }
    }
    public String toString(){
        return String.format("=================\nöğrenci: %s\nMatematik notu: %d\nFizik notu: %d\nKimya notu: %d\ndurum: %s",this.name,this.mat );
    }

}
