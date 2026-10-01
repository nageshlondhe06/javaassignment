 class salesmanager{
int id;
int salary;
String name;
int incentive;
int target;
}
class sale{
public static void main(String[] args) {
salesmanager m1= new salesmanager();
m1.id=103;
m1.salary=60000;
m1.name="diya";
m1.incentive=3400;
m1.target=26;
System.out.println("manager id:"+m1.id);
System.out.println("manager salary:"+m1.salary);
System.out.println("manager name:"+m1.name);
System.out.println("manager incentive:"+m1.incentive);
System.out.println("manager target:"+m1.target);
}
}
