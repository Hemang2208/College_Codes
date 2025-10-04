#include<stdio.h>
#define max 5
int Stack[max] ;
int top=-1; // empty Stack

void push(int val){
    if (top==max-1){
        printf("overflow \n");
    }
    else{
        top+=1;
        Stack[top]=val;
    }
}

int pop(){
    if (top==-1){
        printf("underflow \n");
    }
    else{
        top-=1;
        return Stack[top+1];
    }
}

int peek(){
    if (top==-1) return -1;
    else return Stack[top];
}

int main(){
    for (int i=0 ; i<5 ; i++){
        push(i);
    }

    push(6); // overflow

    printf("%d \n",peek());

     for (int i=0 ; i<5 ; i++){
        printf("%d was popped\n",pop());
    }

    pop(); // underflow

    printf("%d \n",peek());
}