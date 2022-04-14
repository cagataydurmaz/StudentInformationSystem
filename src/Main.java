public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ahmet Hoca","905355601936","MAT") ;
        Teacher t2 = new Teacher("Sezen Hoca ","532555555","FZK") ;
        Teacher t3 = new Teacher("Mahmut Hoca","123132132","BIO") ;

        Course Tarih = new Course("Tarih", "101","MAT") ;
        Tarih.addTeacher(t1);

        Course Fizik = new Course("Fizik","102","FZK") ;
        Fizik.addTeacher(t2);

        Course Biyoloji = new Course("Biyoloji","101","BIO") ;
        Biyoloji.addTeacher(t3);

        Student s1 = new Student("Çağatay Durmaz","20140701060","2",Tarih,Fizik,Biyoloji) ;
        s1.addBulkExamNote(100,74,60);
        s1.isPass();


        Student s2= new Student("Atalay Durmaz","20022002","1",Tarih,Fizik,Biyoloji) ;
        s2.addBulkExamNote(95,23,14);
        s2.isPass();

    }
}
