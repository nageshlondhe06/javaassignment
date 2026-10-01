class bankaccount{
int accountnumber;
String holdername;
int currentbalance;
int interestrate;
}
class account{
public static void main(String[] args) {
bankaccount b= new bankaccount();
b.accountnumber=123;
b.holdername="nagesh";
b.currentbalance=12340;
b.interestrate=5;
System.out.println("bank bankaccount:"+b.accountnumber);
System.out.println("bank name:"+b.holdername);
System.out.println("bank balance:"+b.currentbalance);
System.out.println("bank interest rate:"+b.interestrate);
}
}
