#include "iostream"
#include "climits"

using namespace std;

class MinHeap{
	int cap;
	int size;
	int *harr;
public:
	MinHeap(int capacity);

	int parent(int i){
		if(i%2==0)return i/2;
		else return ((i-1)/2);
	}

	int rightChild(int i){return ((2*i)+1);}

	int leftChild(int i){return (2*i);}

	void insert(int i);

	int getMin(){return harr[1];}

	void popMin();

	void swap(int i, int j){
		int t=harr[i];
		harr[i]=harr[j];
		harr[j]=t;
	}

	void heapfy(int i);//starts the heap procedure at the node and checks in its child for heap conditions
};

MinHeap::MinHeap(int capacity){
	cap=capacity;
	size=0;
	harr=new int[cap];
}

void MinHeap::insert(int i){
	if(size==cap){
		cout<<"Heap Full\n";
		return;
	}
	size++;
	harr[size]=i;
	i=size;
	while(i>1 && harr[i]<harr[parent(i)]){
		swap(i,parent(i));
		i=parent(i);
	}	
}

void MinHeap::heapfy(int i){
	int l=leftChild(i);
	int r=rightChild(i);
	int s=i;
	if(l>size && r>size) return;
	if(harr[i]<harr[l] && harr[i]<harr[r])return;
	if(harr[l]<harr[r] && harr[l]<harr[i])s=l;
	else s=r;
	swap(s,i);
	heapfy(s);
}

void MinHeap::popMin(){
	harr[1]=harr[size];
	size--;	
	heapfy(1);
}

int main(){
	MinHeap h(8);
	h.insert(5);
	h.insert(6);
	h.insert(9);
	h.insert(3);
	h.insert(2);
	h.insert(12);
	h.insert(11);
	h.insert(1);
	cout<<"The sorted values are: \n";
	cout << h.getMin() << " \n";
	h.popMin();
	cout << h.getMin() << " \n";
	h.popMin();
	cout << h.getMin() << " \n";
	h.popMin();
	cout << h.getMin() << " \n";
	h.popMin();
	cout << h.getMin() << " \n";
	h.popMin();
	cout << h.getMin() << " \n";
	h.popMin();
	cout << h.getMin() << " \n";
	h.popMin();
	cout << h.getMin() << " \n";
}
//Works Fine
