//Added check GIT
#include <iostream>


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

// //print the inorder traversal of the tree
// void Inorder(node *root) {
//     if(root){        
//         Inorder(root->left);
//         printf("%d ",root->data);
//         Inorder(root->right);        
//     }
//     else
//         return;
// }

bool printAncestor(node *root, int val){
	if(root==NULL)return false;
	if(root->data==val)return true;
	if(printAncestor(root->left,val)||printAncestor(root->right,val)){
		cout<< root->data << " ";
		return true;
	}
	return false;
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
	//cout<<"In-Order traversal is:\n";
	// Inorder(n);
	printAncestor(n,2);
	cout<<"\n";
	return 1;
}
//Works Fine

