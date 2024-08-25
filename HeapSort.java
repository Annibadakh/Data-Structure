public class HeapSort{
	public void sort(int a[]){
		int n = a.length;
		for(int i=n/2-1;i>=0;i--)
			heapify(a,n,i);
		System.out.println("sorted");
		for(int i=n-1;i>=0;i--){
			System.out.print(a[0]+" ");
			int temp=a[0];
			a[0] = a[i];
			a[i]=temp;
			heapify(a,i,0);
		}
	}
	void heapify(int a[],int n,int i){
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;

		if(l<n && a[l]<a[largest])
			largest=l;

		if(r<n && a[r]<a[largest])
			largest=r;

		if(largest!=i){
			int swap=a[i];
			a[i]=a[largest];
			a[largest]=swap;
			heapify(a,n,largest);
		}
	}
	// static void printA(int a[]){
	// 	int n=a.length;
	// 	for(int i=0;i<n;i++)
	// 	System.out.print(a[i]+" ");

	// 	System.out.println();
	// }
	public static void main(String args[]){
		int a[]={1,12,9,5,6,10};

		HeapSort h = new HeapSort();

		h.sort(a);

	} 
}