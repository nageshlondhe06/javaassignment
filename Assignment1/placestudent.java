class placestudent{
 int frn;
int distance;
String name;
String companyname;
String designation;
}
class employee{
public static void main(String[] args) {
placestudent p1=new placestudent();
p1.frn=102;
p1.distance=23;
p1.name="nagesh";
p1.companyname="honey";
p1.designation="developer";
System.out.println("frn:"+p1.frn);
System.out.println("distance:"+p1.distance);
System.out.println("student name:"+p1.name);
System.out.println("company name:"+p1.companyname);
System.out.println("post:"+p1.designation);
}
}