class Counter{  
int count=0;  
  
Counter(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  

System.out.println("****Non static member****");
Counter c1=new Counter();  
Counter c2=new Counter();  
Counter c3=new Counter(); 
System.out.println("****Static member****") ;
Counter2 c4=new Counter2();  
Counter2 c5=new Counter2();  
Counter2 c6=new Counter2();  
  
 }  
} 
class Counter2{  
static int count=0;  
  
Counter2(){  
count++;  
System.out.println(count);  
}  
}   