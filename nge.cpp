#include <stdio.h>
#include <iostream>

#define MAX_SIZE 100

using namespace std;

struct stack{
	int top;
	int ar[MAX_SIZE];
};

void push(stack* s, int e){
	if(s->top==(MAX_SIZE-1)){
		cout<<"OVERFLOW\n";
		exit(1);
	}else{
		(s->top)++;
		s->ar[s->top]=e;
	}
}

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

int isEmpty(stack* s){
	if(s->top<0)
		return 1;
	else return 0;
}

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

int main(){
	int test_ar[]={11,13,21,3};
	nextGE(test_ar,4);
	return 1;
}

