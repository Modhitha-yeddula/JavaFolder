public class SwapNumbers{
    public static void main(String[] args){
        float first=1.20f,second=2.45f;
        System.out.println("--Before swap--");
        System.out.println("first number="+first);
        System.out.println("second number="+second);
        //value of first is assigned to temporary
        float temporary=first;
        //value of second is assigned to first
        first=second;
        //value of temporary(which contains the initial value of first)is assigned to second
        second=temporary;
        System.out.println("--after swap--");
        System.out.println("first number="+first);
        System.out.println("second number="+second);
    }
}