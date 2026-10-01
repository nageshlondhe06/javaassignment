class employee{
      int id;
      String name;
      long mobile_no;
      int salary;
      String department;
}
class company{
    public static void main(String[] args) {
      employee e1;
     e1=new employee();
     e1.id=12345;
     e1.mobile_no=9527472012L;
     e1.salary=50000;
     e1.name="nagesh";
     e1.department="IT";
  System.out.println("employee id :"+e1.id);
  System.out.println("employee name :"+e1.name);
  System.out.println("mobile_no :"+e1.mobile_no);
 System.out.println("employee salary :"+e1.salary);
  System.out.println("department name:"+e1.department);

}
}