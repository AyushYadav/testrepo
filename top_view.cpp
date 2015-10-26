//Added to check GIT version control and test
#include <stdio.h>
#include <iostream>
#include <map>
#include <vector>

using namespace std;

struct node{
	int data;
	node* left;
	node* right;
};

node* makeRoot(int val){
	node* temp=(node*)malloc(sizeof(node));
	temp->data=val;
	temp->left=NULL;
	temp->right=NULL;
	return temp;
}

// void makeNode(node* root, int val){
// 	if(root==NULL){ 
// 		node* temp=(node*)malloc(sizeof(node));
// 		temp->data=val;
// 		temp->left=NULL;
// 		temp->right=NULL;
// 		return;
// 	}
// 	if(root->data>val)
// 		makeNode(root->left,val);
// 	else
// 		makeNode(root->right,val);	
// }


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

void Inorder(node *root) {
    if(root){        
        Inorder(root->left);
        printf("%d ",root->data);
        Inorder(root->right);        
    }
    else
        return;
}

void getVertOrd(node* root,map<int, vector<int> > &m,int d){
	if(root==NULL)return;
	m[d].push_back(root->data);
	getVertOrd(root->left,m,(d-1));
	getVertOrd(root->right,m,(d+1));
}

void vertical_order(node *root){
	map <int, vector<int> > m;
	getVertOrd(root,m,0);
	vector<int> temp;
	map <int,vector<int> > :: iterator i;
	for(i=m.begin();i!=m.end();i++){
		for(int j=0;j<i->second.size();j++){
			temp=i->second;
			cout <<temp[j]<<" ";
			// cout<<" \n";

		}
	}
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
	cout<<"In-Order traversal is:\n";
	Inorder(n);
	cout<<"\n";
	cout<<"Vertical Order traversal is:\n";
	vertical_order(n);
}
