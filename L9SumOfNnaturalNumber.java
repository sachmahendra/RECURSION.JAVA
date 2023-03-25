public class L9SumOfNnaturalNumber {
    static int getSum(int n){
        if(n==0)
        return 0;
        return n + getSum(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println( getSum(4));
       
    }
}

//O(n) time complexity and aux space
