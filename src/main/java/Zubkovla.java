

public class Zubkovla {
    public long factorial (int n) {
        int result=1,i=1;
        while(i<=n){
            result=result*i;
            i++;
        }
        return result;
    }
}
