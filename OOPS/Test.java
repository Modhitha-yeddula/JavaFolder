class Parent{
    public void m1(){
        System.out.println("Parent Class");
    }
    public void m2(){
        System.out.println("Parent Class m2");

}
    class Child extends Parent{
        public void m3(){
            System.out.println("Child Class m3 method");
        }
public class Test{
    public static void main(String[] args){
        Parent p=new Parent();
        p.m1();
        p.m2();
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        System.out.println(c1.m1());

    }
}
    }
}
