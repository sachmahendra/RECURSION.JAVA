public class L15JosephusProblem {
    static int Jos(int n,int k){
        if(n==1)
        return 0;
        else
        return (Jos(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
       // int n=4;
        //int k=2;
        System.out.println(Jos(4,2));
    }
}
