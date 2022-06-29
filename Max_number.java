import java.util.*;
class Max_number
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int max=0, rem;                              
	System.out.println("Enter the big number= ");
	int n=sc.nextInt();
	
	
	while(n!=0)
	{
		rem=n%10;
		if(rem>max)
			max=rem;
		
		n=n/10;	
	}
	System.out.println("max number is= "+ max);
		
	}

}