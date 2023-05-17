package arrays;

public class ari {

	public static void main(String[] args) 
	{
		int [] a= {10,20,30,40,12,18};
		int [] b= new int [a.length];
		for(int i=0;i<=a.length-1;i++)
		{
		     b[i]  =  a[i];
		}
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
