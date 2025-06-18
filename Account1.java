public class Account1{
    int accId;
    String accName;
    int accBal;
    public Account1(int id,String name,int amount){
        this.accId=id;
        this.accName=name;
        this.accBal=amount;
    }
    public boolean depositAmount(int amount){  // constructor is a special method to intilize object values
        this.accBal=this.accBal+ amount;
        return true;
                                  // consturctor method execute automatically at the time of object creating , only once  AND we can't invoke constructor explicitly

    }
        public  static void main(String[] args){
            Account1 a1=new Account1(101,"rg",5000);
            Account1 a2=new Account1(102,"sg",50000);
            Account1 a3=new Account1(103,"pg",15000);
           System.out.println(a1.accBal);
           System.out.println(a2.accBal);
           System.out.println(a3.accBal);

        }
    }