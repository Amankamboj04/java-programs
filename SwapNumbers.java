class SwapNumbers{
    public static void main(String []args){
        int x=10;
        int y=20;
        int z=30;
        System.out.println("Before swapping values:");
        System.out.println("x:"+x+"|y:"+y+"|z:"+z);
        int temp=x;
        x=y;
        y=z;
        z=temp;
        System.out.println("After swapping values:");
        System.out.println("x:"+x+"|y:"+y+"|z:"+z);
        
        
    }
}