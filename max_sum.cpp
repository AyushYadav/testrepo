#include <iostream>
#include <algorithm>

using namespace std;

int maxAlterSum(int arr[], int n){
	int incl=arr[0];
	int excl=0;
	int temp;
	for(int i=1;i<n;i++){
		temp=(incl>excl)?incl:excl;
		incl=excl+arr[i];
		excl=temp;
	}
	return ((incl>excl)?incl:excl);
}

void leadersArray(int arr[],int n){
	int max=arr[n-1];
	cout << arr[n-1] << " ";
	for(int i=n-2;i>=0;i--){
		if(arr[i]>max){
			cout << arr[i] << " ";
			max=arr[i];
		}
	}
	cout << "\n";
}

void printArray(int k[],int n){
	for(int i=0;i<n;i++)
		cout<<k[i]<<" ";
	cout<<"\n";
}

void printDA(int k[10][2],int n,int m){
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++)
			cout << k[i][j] << " " ;
		cout << "\n";
	}
}

void sortFrequency(int arr[], int n){
	int a[n][2];
	sort(arr,arr+n);
	// printArray(arr, n);
	// int c=1;
	int k=0;
	// int t=arr[0];
	// a[0][0]=t;

//Wrong map function creation

	// for(int i=0;i<(n-1);i++){
	// 	while(arr[i]==arr[i+1]){
	// 		a[k][1]++;
	// 		i++;
	// 	}
	// 	// c=1;
	// 	// t=arr[i];
	// 	a[k][0]=arr[i];
	// 	k++;
		
	// }

	for(int i=0;i<(n-1);i++){
		a[k][0]=arr[i];
		a[k][1]=1;
			while(arr[i]==arr[i+1]){
				a[k][1]+=1;
				i++;
			}
			k++;				
	}
	if(arr[n-1]!=arr[n-2]){
		a[k][0]=arr[n-1];
		a[k][1]=1;
		k++;
	}
	// printDA(a,10,2);

	// cout << "Valid till here\n";


	n=k;
	// cout <<"k= " << k << "\n";
	for(int i=0;i<n-1;i++){
		for(int j=0;j<n-i-1;j++){
			if(a[j][1]>a[j+1][1]){
				int t1=a[j][1];
				int t2=a[j][0];
				a[j][1]=a[j+1][1];
				a[j][0]=a[j+1][0];
				a[j+1][1]=t1;
				a[j+1][0]=t2;
			}
		}
	}
	// c=0;
	for(int i=n;i>=0;i--){
		// cout << a[i][0];
		for(int j=0;j<a[i][1];j++){
			cout<< a[i][0] << " ";
		}
	}

		cout << "\n";

}

int main(){
	int a[]={16, 17, 4, 3, 5, 2 };
	// cout<< maxAlterSum(a,6) << " \n";
	// leadersArray(a,6);
	int af[]={2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
	sortFrequency(af,10);
	return 1;
}