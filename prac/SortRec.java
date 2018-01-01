package batch1_Dec30;

public class SortRec {

	static void bsort(int arr[], int si, int li)
	{
		if(li==0)	return;
		if(si==li)
		{
			bsort(arr,0,li-1);
			return;
		}
		if(arr[si] >  arr[si+1])
		{
			int temp = arr[si+1];
			arr[si+1] = arr[si];
			arr[si] = temp;
		}
		bsort(arr,si+1,li);
	}
	
	static void selecsort(int arr[],int si, int li)
	{
		if(si == arr.length-1)
			return;
		if(li == arr.length)
		{
			selecsort(arr,si+1,si+2);
			return;
		}
		if(arr[si] > arr[li])
		{
			int temp = arr[si];
			arr[si] = arr[li];
			arr[li] = temp;
		}
		selecsort(arr,si,li+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 11, 55, 88, 44};
		//selecsort(arr,0, 1);
		bsort(arr,0,4);
		for(int val:arr)
		{
			System.out.print(val + " ");
		}
	}

}
