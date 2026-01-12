public class Calcul {


   public static int Somme(int L, int M){
        return L+M;
    }

    public static int Difference(int L, int M){
        return L-M;
    }

    public static int Division(int L, int M){
       if (M == 0){
           throw new IllegalArgumentException("Division par zero");
       }
       return L / M;
    }

    public static int Multiplication(int L, int M){
        return L * M;
    }
}
