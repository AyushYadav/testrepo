#include <stdio.h>
#include <iostream>

#define MAX_SIZE 100

using namespace std;

//Stack data structure with array implementation
struct stack{
	int top;
	int ar[MAX_SIZE];
};

//to push to an element to stack
void push(stack* s, int e){
	if(s->top==(MAX_SIZE-1)){
		cout<<"OVERFLOW\n";
		exit(1);
	}else{
		(s->top)++;
		s->ar[s->top]=e;
	}
}

//to pop and element and return from stack
int pop(stack* s){
	if(s->top<0){
		cout<<"UNDERFLOW\n";
		exit(1);
	}else{
		int t=s->top;
		(s->top)--;
		return s->ar[t];
	}
}

//to check if stack is empty or not
//return 1 if empty else 0
int isEmpty(stack* s){
	if(s->top<0)
		return 1;
	else return 0;
}

//prints the next greatest integer in the provided array using the algo as described in the following link
//   http://www.geeksforgeeks.org/next-greater-element/
//using stack data structure
void nextGE(int arr[], int n){
	stack s;
	s.top=-1;
	push(&s, arr[0]);
	int next,element;
	for(int i=1;i<n;i++){
		next=arr[i];
		if(!isEmpty(&s)){
			element=pop(&s);
			while(next>element){
				cout<<element<<" --> "<<next<<"\n";
				if(isEmpty(&s))
					break;
				element=pop(&s);
			}
			if(element>next)
				push(&s,element);
		}
		push(&s,next);
	}
	while(!isEmpty(&s)){
		next=pop(&s);
		cout<<element<<" --> -1\n";
	}
}

//Driver main function to test the function
int main(){
	int test_ar[]={11,13,21,3};
	nextGE(test_ar,4);
	return 1;
}
//Works Fine and in resonable time 

