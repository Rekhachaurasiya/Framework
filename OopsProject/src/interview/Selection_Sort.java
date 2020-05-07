package interview;

public class Selection_Sort {
	public static void main(String[] args) {
	int [] a= {78,21,98,87,45,23};
	int temp=0;
	int min=0;
	for(int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}
}
