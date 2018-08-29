package rank;

public class mytest2 {

	public void QuickSort(int[] data,int low,int high){
		if(low>=high)
			return;
		int middle=getMiddle(data,low,high);
		QuickSort(data,low,middle-1);
		QuickSort(data,middle+1,high);
	}
	public int getMiddle(int []data,int low,int high){
		int key=data[low];
		while(low<high){
			while(low<high&&data[high]>=key){
				high--;
			}
			data[low]=data[high];
			while(low<high&&data[low]<=key){
				low++;
			}
			data[high]=data[low];
		}
		data[low]=key;
		return low;
	}
	
	public void MergeSort(int[] data,int low,int high){
		if(low>=high)
			return;
		int middle=(low+high)/2;
		MergeSort(data,low,middle);
		MergeSort(data,middle+1,high);
		Merge(data,low,middle,high);
	}
	public void Merge(int[] data,int low,int middle,int high){
		int[] temp=new int[data.length+1];
		int start=low;
		int center=middle+1;
		int index=low;
		while(low<=middle && center<=high){
			if(data[low]<=data[center])
				temp[index++]=data[low++];
			else
				temp[index++]=data[center++];
		}
		while(low<=middle)
			temp[index++]=data[low++];
		while(center<=high)
			temp[index++]=data[center++];
		for(int i=start;i<=high;i++){
			data[i]=temp[i];
		}
	}
	
	public void HeapSort(int[] data){
		int n=data.length;
		for(int i=n/2;i>=0;i--){
			adjustHeap(data,i,n-1);
		}
		for(int i=n-1;i>=0;i--){
			int temp=data[0];
			data[0]=data[i];
			data[i]=temp;
			adjustHeap(data,0,i-1);
		}
	}
	
	public void adjustHeap(int[] data,int start,int end){
		int temp=data[start];
		for(int j=start*2;j<end;j*=2){
			if(data[j]<data[j+1]&&start<end)
				j++;
			if(data[j]<=temp)
				break;
			else{
				data[start]=data[j];
				start=j;
			}
		}
		data[start]=temp;
	}
	public void BubbleSort(int[] data){
		int n=data.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(data[j]>data[j+1]){
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
	}
	public void InserSort(int[] data){
		int n=data.length;
		for(int i=1;i<n;i++){
			int k=data[i];
			int j=i;
			for(;j>0&&data[j-1]>=k;j--){
					data[j]=data[j-1];
			}
			data[j]=k;;
		}
	}
	public void SelectSort(int[] data){
		int n=data.length;
		for(int i=0;i<n;i++){
			int temp=data[i];
			int k=i;
			for(int j=i+1;j<n;j++){
				if(data[j]<temp){
					temp=data[j];
					k=j;
				}
			}
			int t=data[i];
			data[i]=data[k];
			data[k]=t;
		}
	}
	public static void main(String[] args) {
		mytest2 m=new mytest2();
		int[] arr={4,76,8,12,9,5,7,3,58};
//		m.BubbleSort(arr);
//		m.SelectSort(arr);
		m.InserSort(arr);
//		m.MergeSort(arr, 0, arr.length-1);
//		m.QuickSort(arr, 0, arr.length-1);
//		m.HeapSort(arr);
		for(int a:arr){
			System.out.print(a+" ; ");
		}
	}

}
