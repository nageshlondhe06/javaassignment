class admin{
int id;
int salary;
String name;
int allowance;
}
class employee{
public static void main(String[] args) {
admin a=new admin();
a.id=100;
a.salary=40000;
a.name="gopiraj";
a.allowance=2300;
System.out.println("admin id:"+a.id);
System.out.println("admin salary:"+a.salary);
System.out.println("admin name:"+a.name);
System.out.println("admin allowance:"+a.allowance);
}
}