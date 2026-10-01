class date{ 
int day;
int month;
int year;
String dow;
 void setday(int i) {
this.day=i;
}
}
class test{
public static void main(String[] args) {
date d1;
d1=new date();
d1.setday(1);

d1.month=9;
d1.year=2026;
d1.dow="wednesday";
System.out.println("day is :"+d1.day);
System.out.println("month is:"+d1.month);
System.out.println("year is :"+d1.year);
System.out.println("day of weak:"+d1.dow);
}
}