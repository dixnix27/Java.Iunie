package s08_04;

public class ex3 {
    public static void main(String[] args) {
        int [] matrice={2,20,3,13,15,3,9,10,1,5,8};
        int c=0;
        for (int i = 0; i < matrice.length; i++) {
            if(matrice[i]%2!=0)c++;
        }
        System.out.println("Nr.impare="+c);

    }
}
