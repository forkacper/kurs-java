package pkg05.instrukcjaswitch;
public class InstrukcjaSwitch {

    public static void main(String[] args) {
        // SWITCH
        
        int a = 50;
        
        switch(a) {
            case 50:
                System.out.println("a jest równe 50");
                break;
            case 100:
                System.out.println("a jest równe 100");
                break;
            default:
                System.out.println("A nie jest równe ani 50 ani 100");
        }
    }
    
}
