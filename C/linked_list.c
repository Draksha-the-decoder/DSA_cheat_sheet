#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data,link;
};

struct node *create(struct node *head)
{
    printf("enter no of nodes/element = ");int size; scanf("%d",&size);
    
    //create 1st node
    printf("enter element = ");
    head = (struct node *)malloc(sizeof(struct node));
    struct node *ptr = head;
    scanf("%d",ptr->data);
    ptr->link = NULL;
   
    while(size-1 > 0)
    {
        printf("enter element = ");
        struct node *current = (struct node *)malloc(sizeof(struct node));
        scanf("%d",current->data);
        current->link=NULL;
        ptr->link=current;
        ptr=ptr->link;
        size--;
    }
    return head;
}
struct node* delete(struct node *head)
{
    return head;
}
void print(struct node *head)
{
    
}
void enter_at_pos(struct node *head)
{
    
}
void delete_at_pos(struct node *head)
{
    
}
int main()
{
    int choice;
    do
    {
        printf("what do you want to do to a linked list \n");
        printf("0.exit 1.create  2.delete  3.print  4.enter at pos  5.delete at pos     choice = ");
        scanf("%d",&choice);
        
        struct node *head = NULL;
        
        switch (choice)
        {
            case 0: exit(0);
            case 1: head=create(head);break;
            case 2: head=delete(head);break;
            case 3: print(head);break;
            case 4: enter_at_pos(head);break;
            case 5: delete_at_pos(head);break;
            default : printf("wrong choice");
        }
        
    }while(choice);
    return 0;
}
