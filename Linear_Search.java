//Linear Search with O(n/2) complexity
import java.util.*;
import java.io.*;

public class Linear_Search {
	public static void Search(int array[],int key)
	{
		int n=array.length;
		int left=0,right=n-1,position=-1;
		while(left<=right)
		{
			if(array[left]==key)
			{
				position=left+1;
				System.out.println("Key fornd at"+position);
				break;
			}
			if(array[right]==key)
			{
				position=right+1;
				System.out.println("Key found at"+position);
				break;
			}
				left++;
				right--;
			}
		if(position==-1)
		{
			System.out.println("Element Not found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key to search");
		int key=sc.nextInt();
		Search(arr,key);
		sc.close();
	}

}
