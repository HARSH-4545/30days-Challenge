#include<stdio.h>
#include<stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

void insertStart (struct Node **head, int data)
{
  struct Node *p=*head;
  struct Node *newNode = (struct Node *) malloc (sizeof (struct Node));

  newNode->data = data;
  newNode->next = p;

  //changing the new head to this freshly entered node
  *head = newNode;
}

void display (struct Node *node)
{
  struct Node *p=node;
  //as linked list will end when Node is Null
  while (p != NULL)
    {
      printf ("%d ", p->data);
      p = p->next;
    }
  printf ("\n");
}

int main ()
{

  //creating 4 pointers of type struct Node
  //So these can point to address of struct type variable
  struct Node *head = NULL;
  struct Node *node2 = NULL;
  struct Node *node3 = NULL;
  struct Node *node4 = NULL;

  // allocate 3 nodes in the heap 
  head = (struct Node *) malloc (sizeof (struct Node));
  node2 = (struct Node *) malloc (sizeof (struct Node));
  node3 = (struct Node *) malloc (sizeof (struct Node));
  node4 = (struct Node *) malloc (sizeof (struct Node));

 struct Node *start=head;
  head->data = 15;		// data set for head node 
  head->next = node2;		// next pointer assigned to address of node2 

  node2->data = 10;
  node2->next = node3;

  node3->data = 12;
  node3->next = node4;

  node4->data = 3;
  node4->next = NULL;

  printf ("Linklist : ");
  display (start);

  // Need '&' i.e. address as we need to change head
  insertStart (&start, 25);

  printf ("\nAfter Inserting Element\n");
  printf ("\nLinklist : ");
  // no need for '&' as head need not be changed
  // only doing traversal
  display (start);
  return 0;
}