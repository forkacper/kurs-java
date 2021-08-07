package pkg06.tablicewielowymiarowe;
public class TabliceWielowymiarowe {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int[][] tab = new int [4][3];
        
        tab[0][0] = 25;
        
        System.out.println(tab[0][0]);
        
        int[][] tab2 = {
            {1, 11, 22},
            {2, 12, 33},
            {3, 13, 44}
        };
        System.out.println(tab2[2][1]);
              
        int[][] tab3 = {
        {1, 2, 3},
        {5, 6, 7},
        {9, 10, 11}
    };
    
        System.out.println(tab3[0][0]);
    
    }
    
}
