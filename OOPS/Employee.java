class Employee{
    private int Emp_Id;
   private String Emp_Name;
   public void set_Emp_Id(int eid){
    this.Emp_Id=eid;
   }
   public int get_Emp_Id(){
     return this.Emp_Id;
   }
   public void set_Emp_Name(String ename){
        this.Emp_Name=ename;
    }
    public String get_Emp_Name(){
        return this.Emp_Name;
}
public class Demo1{
    public static void main(String[] args){
        Employee e=new Employee();
        Employee e1=new Employee();
        e.set_Emp_Id(101);
        e1.set_Emp_Name("ram");
        System.out.println("e.eid");
        System.out.println("e1.ename");

    }
}
}