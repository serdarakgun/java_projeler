public class Main {
    public static void main(String[] args) {

        Ders mat = new Ders("Matematik", "MAT101", "MAT");
        Ders fizik = new Ders("Fizik", "FZK101", "FZK");
        Ders kimya = new Ders("Kimya", "KMY101", "KMY");

        Ogretmen t1 = new Ogretmen("Mahmut Hoca", "90550000000", "MAT");
        Ogretmen t2 = new Ogretmen("Fatma Ayşe", "90550000001", "FZK");
        Ogretmen t3 = new Ogretmen("Ali Veli", "90550000002", "KMY");


        Ogrenci s1 = new Ogrenci("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.sozlu(100,80,70);
        System.out.println(s1.name);
        s1.isPass();

        Ogrenci s2 = new Ogrenci("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        System.out.println(s2.name);
        s2.isPass();

        Ogrenci s3 = new Ogrenci("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        System.out.println(s3.name);
        s3.isPass();

        mat.addTeacher(t1);
        mat.printTeacher();
        mat.addTeacher(t2);
        mat.printTeacher();
    }
}