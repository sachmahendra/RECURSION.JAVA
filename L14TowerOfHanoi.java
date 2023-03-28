class L14TowerOfHanoi {
    static void ToH(int n,char A,char B,char C){
        if(n==1){
            System.out.println("move 1 from "+A +" To "+ C);
            return;
        }
        ToH(n-1,A,C,B);
            System.out.println("move "+n+" From "+A+" To "+C);
            ToH(n-1,B,A,C);
    }
    public static void main(String[] args) {
        int n=3;
        ToH(n=3,'A','B','C');
    }

}
