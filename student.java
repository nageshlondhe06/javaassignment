class student{
  int frn_number;
  String name;
  int distancecovered;
}

class test{
public static void main(String[] args) {

   student s1=new student();
    s1.frn_number=32;
    s1.name="nagesh";
    s1.distancecovered=234;
System.out.println("frn number:"+s1.frn_number);
System.out.println("student name:"+s1.name);
System.out.println("distance covered:"+s1.distancecovered);
}
}