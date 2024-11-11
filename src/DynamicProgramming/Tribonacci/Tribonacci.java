package DynamicProgramming.Tribonacci;

public class Tribonacci {
    public static int trib(int n)
    {
        if(n==0 || n==1)return 0;
        if(n==2)return 1;
        return trib(n-1)+trib(n-2)+trib(n-3);
    }
    public static void main(String[] args) {
        System.out.println(trib(6));
    }
}
