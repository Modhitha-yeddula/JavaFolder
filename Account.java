public class Account{
    int accId;
    String accName;
    int accBal;
    public Account(int id, String name, int amount){
        this.accId=id;
        this.accName=name;
        this.accBal=amount;

    }
    public boolean depositAmount(int amount){
        this.accBal=this.accBal+amount;
        return true;
    } 
    public static void main(String[] args){
      Account A =new Account(101,"rg",500);
        Account B=new Account(102,"sg",1000);
        System.out.println(A.accName);
        System.out.println(B.accName);
       
    }
}