public class L6Print1toN {
    static void print1toN(int n){
        if(n==0)
        return;
        print1toN(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        print1toN(5);
    }
}