class Employee{
   private int eid;
   private String ename;
   public void set_Emp_Id(int eid){
    this.Emp_Id=eid;
   }
   public int get_Emp_Id(){
     return this.Emp_Id;
   }
   public void set_Emp_Name(String ename){
        this.Emp_Name=ename;
    }
    public int get_Emp_Name(){
        return this.Emp_Name;
}
class Demo{
    public static void main(String[] args){
        Employee e=new Employee();

    }
}