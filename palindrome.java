import java.util.*;
class palindrome
{	
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);    // scanner class object
	int n,i,rev=0,rm;                    //  variable declaration 
	System.out.print("Enter the number= ");
	n=sc.nextInt();                        // using scanner object taking input by user
	i=n;
	
	while(i!=0)
	{
		rm=i%10;       // finding reminder we use
		rev=rev*10+rm;   // finding reverse formula
		i=i/10;             //for updating is
	}
	if(n==rev)
		{
		System.out.println("It is palindrome number");
		}
	else
		{
		System.out.println("It is not palindrome number");
		}

	}
} 