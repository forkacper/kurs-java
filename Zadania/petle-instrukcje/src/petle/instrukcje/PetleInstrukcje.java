package petle.instrukcje;
public class PetleInstrukcje {
    
    static void fromZero(int x) {
//        for(int i = 0; i <= x; i++) {
//            System.out.println(i);
//        }
        int b = 0;
        while(b <= x) {
            System.out.println(b++);
        }
    }    
    
    public static void main(String[] args) {
        PetleInstrukcje.fromZero(10);
    
        ArrayFactory af = new ArrayFactory(5);
        af.oneDimension();
        af.twoDimension();
    }
    
}

class ArrayFactory {
    private int x;

    public ArrayFactory(int x) {
        this.x = x;
    }
    
     public void oneDimension() {
         int[] oneDimension = new int[x];
     }
     public void twoDimension() {
         int[][] twoDimension = new int[x][x];
     }
     
}
