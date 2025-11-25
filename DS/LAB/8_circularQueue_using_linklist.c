#include<stdio.h>
#include<stdlib.h>
# define max 5

typedef struct node{
    int val;
    struct node* next;
}node;

typedef struct cqueue{
    node* front;
    node* rear;
    int count;
}cqueue;

cqueue cq = {NULL,NULL,0};

void enqueue(int x){
    node* newnode = malloc(sizeof(node));
    newnode->val=x;
    newnode->next=NULL;
    if (cq.count==max) printf("Overflow\n");
    else{
        if (cq.front==NULL){
            cq.front=newnode;
            newnode->next=cq.front;
            cq.rear=newnode;
            cq.rear->next=cq.front;
            cq.count++;
        }
        else{
            newnode->next=cq.front;
            cq.rear->next=newnode;
            cq.rear=newnode;
            cq.count++;

        }
    }
}

void dequeue(){
    if (cq.front==NULL) printf("Underflow\n");
    else{
        if (cq.front==cq.rear){
            printf("dequeueped %d\n",cq.front->val);
            cq.front=NULL;
            cq.rear=NULL;
            cq.count--;
        }
        else{
            printf("dequeueped %d\n",cq.front->val);
            cq.front=cq.front->next;
            cq.rear->next=cq.front;
            cq.count--;
        }
    }
}

void peek(){
    if (cq.front==NULL) printf("Queue empty\n");
    else printf("Current front is %d\n",cq.front->val);
}
    

int main(){
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);

    // node* curr=cq.front;
    // int c=1;
    // while(c<=cq.count){
    //     printf("%d ",curr->val);
    //     curr=curr->next;
    //     c++;
    // }

    peek();

    dequeue();
    dequeue();

    enqueue(5);
    enqueue(6);

    peek();

//     dequeue();
//     dequeue();

//     peek();

//     dequeue();
//     dequeue();

//     peek();
}