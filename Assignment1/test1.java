class date{ 
int day;
int month;
int year;
String dow;
 void setday(int i) {
this.day=i;
}
void setday(String i) {
this.dow=i;
}
void setday(int i) {
this.month=i;
}
void setday(int i) {
this.year=i;
}
void display(){
System.out.println("day is :"+d1.day);
System.out.println("month is:"+d1.month);
System.out.println("year is :"+d1.year);
System.out.println("day of weak:"+d1.dow);
}

}
class test{
public static void main(String[] args) {
date d1;
d1=new date();
d1.setday(1);
d1.setdow("thurday");
d1.setmonth(10);
d1.setyear(2026);
d1.display();

//System.out.println("day is :"+d1.day);
//System.out.println("month is:"+d1.month);
//System.out.println("year is :"+d1.year);
//System.out.println("day of weak:"+d1.dow);
}
}