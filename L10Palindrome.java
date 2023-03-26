/* 
public class L10Palindrome {
    public static void main(String[] args) {
        int n=151;
        int temp=n;
        int s=0;
        int r;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(s==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}

*/

//BY USING RECURSION 

public class L10Palindrome {
    static boolean isPalindrome(String str,int start,int end){
         if(start>=end)
         return true;
         return(str.charAt(start)==str.charAt(end)) &&
         isPalindrome(str, start+1, end-1);
 
     }
     public static void main(String[] args) {
         String s="abcba";
         System.out.println(isPalindrome(s,0,s.length() -1));
         
 
     }
 }
 
