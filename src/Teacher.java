public class Teacher {
    // nitelikler
    String name ;
    String telno ;
    String branch ;

    //constructor metot
    Teacher(String name,String telno,String branch){
        this.name = name ;
        this.telno = telno ;
        this.branch = branch ;
    }

    //yazdırma fonksiyonu
    void print() {

        System.out.println("adı : " +this.name);
        System.out.println("tel no : " +this.telno);
        System.out.println("brans : " +this.branch);
    }

}
