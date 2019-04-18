public class MergeSort{
	public void mergeSort(int arr[],int l ,int r){
		if(l<r){
			int m=(l+r)/2;
			//for the left part of the array
			mergeSort(arr,l,m);
			//for the right part of the array
			mergeSort(arr,m+1,r);

			//Merge the sorted halves
			merge(arr,l,m,r);
		}
	}
	public merge(int arr[],int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;

		int lT[]=new int[n1];
		int rT[]=new int[n2];
		//temporary arrays
		for(int i=0;i<n1;++i)
			lT[i]=arr[l+i];
		for(int j=0;j<n2;++j)
			rT[j]=arr[m+1+j];
		
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(lT[i]<=rT[j]){
				arr[k]=lT[i];
				i++;
			}
			else
			{
				arr[k]=rT[j];
				j++;
			}
			k++;

		}
		
		while(i<n1){
			arr[k]=lT[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k]=rT[j];
			j++;
			k++;
		}
	}
}