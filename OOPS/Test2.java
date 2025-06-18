class Test2{
    int a;
    Test2(int a){
       this.a=a;

    }
    public static void main(String[] args){
        Test2 t1= new Test2(10);
        Test2 t2= new Test2(20);
        System.out.println(t1.a);
        System.out.println(t2.a);
    }
}