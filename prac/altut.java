package batch1_Dec30;
import java.util.*;
public class altut {

	static ArrayList<Integer> intersec(int arr1[], int arr2[])
	{
		ArrayList<Integer> ans = new ArrayList<>();
		int beg1 = 0,beg2=0;
		while(beg1!=arr1.length && beg2!=arr2.length)
		{
			if(arr1[beg1] == arr2[beg2])
			{
				ans.add(arr1[beg1]);
				beg1++;
				beg2++;
			}
			else if(arr1[beg1]<arr2[beg2])
				beg1++;
			else 
				beg2++;
		}
		return ans;
	}
	
	
	static void merge(int arr[],int beg, int mid, int end)
	{
		int beg2=mid+1,beg1=beg;
		while(beg1 <= mid && beg2<=end)
		{
			if(arr[beg1] <= arr[beg2])
			{
				beg1++;
			}
			else{
				int temp = arr[beg2];
				arr[beg2] = arr[beg1];
				arr[beg1]=temp;
				beg1++;
			}
		}
	}
	
	static void mergeSort(int arr1[], int beg, int end)
	{
		if(beg<end)
		{
			int mid = (beg+end)/2;
			mergeSort(arr1,beg,mid);
			mergeSort(arr1,mid+1,end);
			merge(arr1,beg,mid,end);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,3,4,4,5,5};
		int arr2[] = {1,1,1,2,3,5,5,7,8};
		ArrayList<Integer> ans= intersec(arr1, arr2);
		System.out.println(ans);
		ans.remove(Integer.valueOf(5));
		System.out.println(ans);
		int unsortarr[] = {10,40,20,30,100,2,5,8,10};
		mergeSort(unsortarr,0,8);
		for(int val:unsortarr)
			System.out.print(val + " ");
	}

}
