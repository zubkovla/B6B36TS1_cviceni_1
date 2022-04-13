

public class Zubkovla {
    public long factorial (int n) {
        int result=1,i=1;
        while(i<=n){
            result=result*i;
            i++;
        }
        return result;
    }

    public static int factorialRecursive(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n*factorialRecursive(n-1);
        }
    }
}
