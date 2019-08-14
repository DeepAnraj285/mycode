package classwork;
import java.io.*;
import java.util.*;
public class ebill {
	public static void main(String[] args) {
	customerdata ob=new customerdata();
	ob.getdata();
	ob.calc();
	ob.display();
	}
}
class customerdata
{
	String cname;
	int bn,type;
	double current,previous,ebill,units;
	void getdata()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter consumer number:");
		bn=in.nextInt();
		System.out.println("Enter consumer name:");
		cname=in.next();
		System.out.println("Enter type of connection:(0 for Domestic or 1 for commerical)");
		type=in.nextInt();
		System.out.println("Enter previous month reading:");
        previous=in.nextDouble();
		System.out.println("Ener the current month reading:");
		current=in.nextDouble();
	}
    void calc()
    {
    	units=current-previous;
    	if(type==0)
    	{
    		if(units<=100)
    			ebill=units*1;
    		else if(units<100&&units>=200)
    			ebill=((units-100)*2.50)+100;
    		else if(units<200&&units>=300)
    			ebill=((units-200)*4)+350;
    		else
    			ebill=((units-500)*6)+750;
    	}
    	else
    	{
    	if(units<=100)
    		ebill=units*2;
    	else if(units>100&&units<=200)
    		ebill=((units-100)*4.50)+200;
    	else if(units>200&&units<=500)
    		ebill=((units-200)*6)+650;
    	else
    		ebill=((units-500)*7)+1250;
    	}
}
    void display()
    {
    	System.out.println("Consumer number:"+bn);
    	System.out.println("Consumer name:");
    	{
      	if(type==0)
      	{
    		System.out.println("Type of connection=Domestic ");
      	}      
    	else 
    		System.out.println("Type of connection=Commercial");
    	}
    	System.out.println("Current month reading:"+current);
    	System.out.println("Prevoius month reading:"+previous);
    	System.out.println("Total units:"+units);
    	System.out.println("Total bill:"+ebill);
    	
    }
}
