#include <stdio.h>
#include <iostream>
#include <string>

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

//TO print the largest valid substring in the given string
//Logic : http://www.geeksforgeeks.org/length-of-the-longest-valid-substring/
//the efficient implementation

void largestSubString(string str,int n){
	stack s;
	int maxlen=0;
	s.top=-1;
	char ch=str[0];
	push(&s,-1);
	for(int i=0;i<n;i++){
		ch=str[i];
		//cout<<ch;
		if(ch=='('){
			push(&s,i);
		}
		else{
			int a=pop(&s);
			if(a>maxlen){
				maxlen=(i-a+1)+maxlen;
			}else push(&s,i);

		}
		
	}
	cout<<maxlen<<"\n";
}

//driver main function
int main(){
	string str = "()(()))))";
		largestSubString(str,9);
		return 0;
}
//works Fine 
