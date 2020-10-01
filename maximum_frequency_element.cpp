#include<stdio.h>
#include<conio.h>
main(){
	/* max freq return */
	int ar[50],n,i,count=1;
	printf("enter size of array");
	scanf("%d",&n);
	printf("enter elements");
	for(i=0;i<n;i++){
		scanf("%d",&ar[i]);	
	}
	for(i=0;i<n;i++){
		if(ar[i]==ar[i+1])
			count++;
	}
	printf("maximum frequency of element is");
	printf("%d\n",count);
	
	
getch();
}
