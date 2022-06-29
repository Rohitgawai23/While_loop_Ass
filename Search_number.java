import java.util.*;
class Search_number
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n,i,rem;
	System.out.println("Enter the big number ");
	n=sc.nextInt();
	System.out.println("Enter finding number ");
	int k=sc.nextInt();
	int c=0;
	i=n;
	while(i!=0)
	{
		rem=i%10;
		if(rem==k)
		{
			c=1;
			break;
		}
		i=i/10;
	}
	if(c==1)
	{
		System.out.println("number is found");
	}
	else
	{
		System.out.println("not found ");
	}

}
}