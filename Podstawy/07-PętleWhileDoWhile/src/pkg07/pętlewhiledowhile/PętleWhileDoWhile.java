package pkg07.pętlewhiledowhile;
public class PętleWhileDoWhile {
    public static void main(String[] args) {

         String[] kurs = {
        "Java",
        "JS",
        "PHP",
        "C++",
        "C#",
        "C",
        "Pascal",
        "Node.JS"
    };
       int i = 0; 
       while(i < kurs.length) {
            System.out.println(kurs[i]);
        i++;
       }
       
       i = 0;
       do {
           System.out.println(kurs[i]);
       }while(i < kurs.length);
    }
    
}
