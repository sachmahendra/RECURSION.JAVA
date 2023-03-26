/* 
public class L11SumOfDigits {
    public static void main(String[] args) {
        int n=253;
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;    
        }
        System.out.println(sum);
        }
    }

    //time compl theta(d)
    // space comp theta(1)

    */

    //BY USIGN RECURSION
    class L11SumOfDigits {
        static int getSum(int n){
            if(n<10)
            return n;
            return getSum(n/10) + n%10;
        }
        public static void main(String[] args) {
            //int n=1234;
            System.out.println(getSum(345));
        }
    }
    
    //time com  theta(d);
    //space compl theta(d)