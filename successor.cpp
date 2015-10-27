//Added check GIT
#include <iostream>

#define MAX_SIZE 100

using namespace std;

//A tree structure to store the individual nodes
struct node{
	int data;
	node* left;
	node* right;
};

//makes the root node of the tree
node* makeRoot(int val){
	node* temp=(node*)malloc(sizeof(node));
	temp->data=val;
	temp->left=NULL;
	temp->right=NULL;
	return temp;
}

//makes the nodes of the tree according to the binary search tree 
void makeNode(node* root, int val){
	if(root->data>val){
		if(root->left==NULL){
			node* temp=(node*)malloc(sizeof(node));
			temp->data=val;
			temp->left=NULL;
			temp->right=NULL;
			root->left=temp;
			return;
		}
		makeNode(root->left,val);
	}else{

		if(root->right==NULL){
			node* temp=(node*)malloc(sizeof(node));
			temp->data=val;
			temp->left=NULL;
			temp->right=NULL;
			root->right=temp;
			return;
		}
		makeNode(root->right,val);
	}
}

// void sucessorValue(node* root, int val){
// 	int greatest=val;
// 	while(root){
// 		if(root->data>val)&&(root->data<greatest){
// 			greatest=root->data;
// 		}

// 	}

// }




//print the inorder traversal of the tree
void Inorder(node *root, int *arr, int *k) {
    if(root){        
        Inorder(root->left,arr,k);
        //printf("%d ",root->data);
        arr[*k]=root->data;
        (*k)++;
        Inorder(root->right,arr,k);        
    }
    else
        return;
}

void successorValue(int val, int *arr){
	int i=0;
	while(i<sizeof(arr)){
		if(arr[i]==val){
			if(i!=sizeof(arr)){
				cout<<arr[i+1];
				return;
			}
		}

		i++;
	}
	return ;
}


int main(){
	node* n=makeRoot(10);
	makeNode(n,5);
	makeNode(n,3);
	makeNode(n,2);
	makeNode(n,4);
	makeNode(n,15);
	makeNode(n,12);
	makeNode(n,17);
	int k=0;
	int ar[8];
	// node *ar=(node*)malloc(sizeof(node)*8);
	//cout<<"In-Order traversal is:\n";
	Inorder(n,ar,&k);
	successorValue(5,ar);
	// cout<< sv->data;
	cout<<"\n";
	return 1;
}
