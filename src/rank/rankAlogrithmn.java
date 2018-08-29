package rank;

public class rankAlogrithmn {
	//1.快速排序
	public void QuickSort(int[] arr,int low,int high){
		if(low<high){
			int middle=getMiddle(arr,low,high);
			QuickSort(arr, low, middle-1);
			QuickSort(arr,middle+1,high);
		}
	}
	public int getMiddle(int[] arr,int low,int high){
		int key=arr[low];
		while(low<high){
			while(low<high&&arr[high]>=key){
				high--;
			}
			arr[low]=arr[high];
			while(low<high&&arr[low]<key){
				low++;
			}
			arr[high]=arr[low];
		}
		arr[low]=key;
		return low;
	}
	//2.归并排序
	public void MergeSort(int[] arr,int low,int high){
		if(low>=high)
			return;
		int middle=(low+high)/2;
		MergeSort(arr, low, middle);
		MergeSort(arr, middle+1, high);
		merge(arr,low,middle,high);
	}
	public void merge(int[] arr, int low, int middle, int high){
		int[] tmpArr=new int [arr.length+1];
		int index=low;
		int center=middle+1;
		int start=low;
		while(low<=middle && center<=high){
			if(arr[low]<=arr[center])
				tmpArr[index++]=arr[low++];
			if(arr[low]>arr[center])
				tmpArr[index++]=arr[center++];
		}
		while(low<=middle){
			tmpArr[index++]=arr[low++];
		}
		while(center<=high){
			tmpArr[index++]=arr[center++];
		}
		for(int i=start;i<=high;i++){
			arr[i]=tmpArr[i];
		}
	}
	//3.冒泡排序
	public void BubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	//4.插入排序
	public void InserSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int key=arr[i];
			int j;
			for( j=i;j>0 && arr[j-1]>key;j--){
				arr[j]=arr[j-1];
			}
			arr[j]=key;
		}
	}
	//5.选择排序
	public void SelectSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int k=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[k]>arr[j])
					k=j;
			}
			int temp=arr[k];
			arr[k]=arr[i];
			arr[i]=temp;
		}
	}
	//6.堆排序
	public void HeapSort(int[] arr){
		for(int i=arr.length/2-1;i>=0;i--){//最后一个非叶子结点开始
			adjustHeap(arr,i,arr.length-1);
		}
		for(int j=arr.length-1;j>=0;j--){
			int temp=arr[0];
			arr[0]=arr[j];
			arr[j]=temp;//交换
			adjustHeap(arr,0,j-1);
		}
	}
	public void adjustHeap(int[] arr,int startindex,int maxindex){
		int temp=arr[startindex];
		for(int j=startindex*2;j<maxindex;j*=2){
			if(j<maxindex && arr[j]<arr[j+1])
				j++;
			if(temp>=arr[j])
				break;
			else{
				arr[startindex]=arr[j];
				startindex=j;
			}
		}
		arr[startindex]=temp;
	}
	public static void main(String[] args) {
		rankAlogrithmn r=new rankAlogrithmn();
		int[] arr={4,76,8,12,9,5,7,3,58};
//		int[] quickarr=arr;
//		r.QuickSort(arr,0,arr.length-1);
//		r.MergeSort(arr, 0, arr.length-1);
//		r.BubbleSort(arr);
//		r.InserSort(arr);
//		r.SelectSort(arr);
		r.HeapSort(arr);
		for(int a:arr){
			System.out.println(a);
		}
	}

}
