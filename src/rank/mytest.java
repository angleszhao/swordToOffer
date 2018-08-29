package rank;

public class mytest {

	//1.√∞≈›≈≈–ÚBubbleSort
	public void BubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j+1]<a[j]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	//2.—°‘Ò≈≈–ÚSelectSort
	public void SelectSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int k=i;
			for(int j=i;j<arr.length;j++){
				if(arr[j]<temp){
					k=j;
					temp=arr[j];
				}
			}
			int swap=arr[i];
			arr[i]=arr[k];
			arr[k]=swap;
		}
	}
	//3.≤Â»Î≈≈–ÚInserSort
	public void InserSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int temp=arr[i];
			int j;
			for(j=i;j>0&&arr[j-1]>temp;j--){
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
	}
	//4.πÈ≤¢≈≈–ÚMergeSort
	public void MergeSort(int[] arr,int low,int high){
		if(low>=high)
			return;
		int middle=(low+high)/2;
		MergeSort(arr,low,middle);
		MergeSort(arr,middle+1,high);
		Merge(arr,low,middle,high);
	}
	public void Merge(int[] arr,int low,int middle,int high){
		int index=low;
		int[] tempArr=new int[arr.length+1];
		int center=middle+1;
		int start=low;
		while(low<=middle && center<=high){
			if(arr[low]<=arr[center])
				tempArr[index++]=arr[low++];
			else
				tempArr[index++]=arr[center++];
		}
		while(low<=middle){
			tempArr[index++]=arr[low++];
		}
		while(center<=high){
			tempArr[index++]=arr[center++];
		}
		for(int i=start;i<=high;i++){
			arr[i]=tempArr[i];
		}
	}
	//5.øÏÀŸ≈≈–ÚQuickSort
	public void QuickSort(int[] arr,int low,int high){
		if(low>=high)
			return;
		int middle=getMiddle(arr,low,high);
		QuickSort(arr,low,middle-1);
		QuickSort(arr,middle+1,high);
	}
	public int getMiddle(int[] arr,int low,int high){
		int key=arr[low];
		while(low<high){
			while(low<high && arr[high]>key){
				high--;
			}
			arr[low]=arr[high];
			while(low<high&& arr[low]<=key){
				low++;
			}
			arr[high]=arr[low];
		}
		arr[low]=key;
		return low;
	}
	//6.∂—≈≈–ÚHeapSort
	public void HeapSort(int[] arr){
		for(int i=arr.length/2-1;i>=0;i--){
			adjustHeap(arr,i,arr.length-1);
		}
		for(int i=arr.length-1;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			adjustHeap(arr,0,i-1);
		}
	}
	public void adjustHeap(int[] arr,int start,int maxlen){
		int temp=arr[start];//root
		for(int j=start*2;j<maxlen;j*=2){//leaf
			if(j<maxlen&&arr[j]<arr[j+1]){
				j=j+1;
			}
			if(arr[j]<=temp){
				break;
			}else{
				arr[start]=arr[j];
				start=j;
			}
		}
		arr[start]=temp;
	}

	//◊Ó¥Û÷µ∂—
	public void HeapSort2(int[] arr){
		for(int i=arr.length/2-1;i>=0;i--){
			adjustHeap2(arr,i,arr.length-1);
		}
		for(int i=arr.length-1;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			adjustHeap2(arr,0,i-1);
		}
	}
	public void adjustHeap2(int[] arr,int start,int maxlen){
		int temp=arr[start];//root
		for(int j=start*2;j<maxlen;j*=2){//leaf
			if(j<maxlen&&arr[j]>arr[j+1]){
				j=j+1;
			}
			if(arr[j]>=temp){
				break;
			}else{
				
				arr[start]=arr[j];
				start=j;
			}
		}
		arr[start]=temp;
	}
	public static void main(String[] args) {
		mytest m=new mytest();
		int[] arr={4,76,8,12,9,5,7,3,58};
//		m.BubbleSort(arr);
//		m.SelectSort(arr);
//		m.InserSort(arr);
//		m.MergeSort(arr, 0, arr.length-1);
//		m.QuickSort(arr, 0, arr.length-1);
		m.HeapSort2(arr);
		for(int a:arr){
			System.out.print(a+" ; ");
		}
	}
}
