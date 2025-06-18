class Gp{
 public void m1(){
    System.out.println("Parent class m1");
 }
    private void m2(){
        System.out.println("Parent class m2");
    }
class Parent extends Gp{
    public void m3(){
    System.out.println("Parent class m3");
}
}
class Child extends Parent{
    public void m4(){
    System.out.println("Parent class m4");
    }
    public class Test1{
        public static void main(String[] args){
            Child c1= new Child();
            c1.m1();
        }
    }
}
}