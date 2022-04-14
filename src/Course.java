public class Course {

    Teacher teacher;//derse teacher gireceğimiz için diğer teacher nesnesini veri tipi olarak kullanırız.Nesne (referans) ürettim.Sınıflar birbirinin niteliği

    String name;
    String code;
    String prefix;  //prefix'in teacher branch'i ile aynı olmasını bekleriz.
    int note;

    Course(String name,String code,String prefix) {

        this.name = name ;
        this.code = code ;
        this.prefix = prefix ;
        int note = 0 ;

    }

    void addTeacher(Teacher teacher){  // dışarıdan aldığım teacher nesnesini içerdeki nesneye eşitleyen metot

        if(teacher.branch.equals(this.prefix)){

            this.teacher = teacher ;
        }
        else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }
}

