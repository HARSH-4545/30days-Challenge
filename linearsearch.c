#include<stdio.h>
int main()
{
    int arr[10],index, ans=-1;
    printf("Enter matrix");
    for(int i=0; i<10; i++)
        scanf("%d",&arr[i]);
        printf("Which elemnt you want to search\n");
        scanf("%d",&index);
        for(int i=0;i<10;i++){
            if(index==arr[i])
                ans=i;
                break;
            }
            if(index>=0){
                printf("Element is present at index= %d",index);

            }
            else
            printf("Elemnt  does not exist");
            return 0;

    
}