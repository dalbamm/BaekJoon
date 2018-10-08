#include <stdio.h>
#include <stdlib.h>
int main(void){
    int N,i,*arr,j,idx_min,min,tmp;
    scanf("%d",&N);
    arr = (int*)malloc(sizeof(int) * N);
    for(i = 0 ; i < N ; ++i){
        scanf("%d",arr+i);
    }
    for(i = 0 ; i < N ; ++i){
        min = arr[i];
        idx_min = i;
        for( j = i+1 ; j < N ; ++j){
            if(min>arr[j]){
                min=arr[j];
                idx_min = j;
            }
        }
        if(i!=idx_min)
        {
            tmp = arr[idx_min];
            arr[idx_min]=arr[i];
            arr[i]=tmp;
        }
        printf("%d\n",arr[i]);
    }
    
}