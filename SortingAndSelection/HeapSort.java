public class HeapSort{
	public static void heapSort(int arr[]){
		int n=arr.length;

		for(int i=n/2-1;i>=0;i--)
			heapify(arr,n,i);   //Create a max heap
		for(int i=n-1;i>=0;i--){
			//swap first and last node
			int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
			heapify(arr,i,0)
		}
	}
	void heapify(int arr[],int n,int i){
		int root=i;
		int l=2*i +1;
		int r=2*i +2;
		//left child > root
		if(l < n && arr[l]>arr[root])
			largest=l;
		//right child > root
		if(r < n && arr[r]>arr[root])
			largest=r;
		
		//if root is not root	
		if(root !=i){
			int temp=arr[i];
			arr[i]=arr[root];
			arr[root]=temp;

			heapify(arr,n,root);
		}	
	}
}