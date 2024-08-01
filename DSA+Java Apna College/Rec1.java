class pint{
     void printnum(int n){
        if(n==1)
        System.out.print(n);
        else{
        System.out.print(n+" ");
        printnum(n-1);
        }
}
}
 class Rec1{
        public static void main(String[] args){
           pint ob = new pint();
           ob.printnum(5);
        }
    }
