import java.util.*;
class Dublacket 
{int a[];

	void setArray(int a[])
	{
		this.a=a;
	}
	void  getSortedArray()
	{
		
		int l=a.length;
		int count=0;
		for(int i=0;i<a.length;i++)
		{	
			boolean flag=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{	
				for(int k=j;k>=0;k--)
				{
					if(a[k]==a[j])
					{
						
					flag=false;
					}
					
				}
				}
			}
			if(flag==true)
			{
				count++;
			}
		}
		int b[]=new int[count];
		
		int v=0;
		for(int i=0;i<a.length;i++)
		{	
			boolean flag=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{	
				for(int k=j;k>=0;k--)
				{
					if(a[k]==a[j])
					{
						
					flag=false;
					}
					
				}
				}
			}
			if(flag==true)
			{
					b[v]=a[i];
					v++;
			}
			
			
		}
		for(int i=0;i<b.length;i++)
		{
				System.out.print(b[i]);
		}
	}
	
}

	public class DArray
	{
		public static void main(String x[])
		{
			Scanner xyz=new Scanner(System.in);
			
			System.out.println("enter the number of Areay Size");
			int size=xyz.nextInt();
			int a[]=new int[size];
			System.out.println("enter the elements ");
			for(int i=0;i<a.length;i++)
			{
				a[i]=xyz.nextInt();
			}
			
			Dublacket D=new Dublacket();
			D.setArray(a);
			D.getSortedArray();
		}
	}