import java.util.*;
class factorial_increment
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n,fact=1;                              
	System.out.println("Enter the number ");
	n=sc.nextInt();
	int i=1;
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	System.out.println("factorial= " + fact);
		
	}

}