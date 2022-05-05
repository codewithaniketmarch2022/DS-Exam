import java.util.Iterator;
import java.util.PriorityQueue;

class InsertionSort{
	private static void ksort(int[] arr,int n,int k)
	{
    PriorityQueue<Integer>PriorityQueue=new PriorityQueue<>();
	
	for(int i=0;i<k+1;i++){
		PriorityQueue.add(arr[i]);
	}
	int index = 0;
	for(int i=k+1;i<n;i++){
		arr[index++]=PriorityQueue.peek();
		PriorityQueue.poll();
		PriorityQueue.add(arr[i]);
	}
	Iterator<Integer>itr = PriorityQueue.iterator();
	
	while(itr.hasNext()){
		arr[index++] = PriorityQueue.peek();
		PriorityQueue.poll();
	}
	}
	private static void printArray(int[] arr,int n)
	{
		for(int i =0;i<n;i++)
			System.out.println(arr[i] + " ");
	}
	public static void main(String [] args)
	{
		int k=3;
		int arr[]={1,2,4,5,3};
		int n =arr.length;
		ksort(arr,n,k);
		System.out.println("Sorted Array");
		printArray(arr,n);
	}
}
		
	
