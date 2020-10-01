#include<stdio.h>
#include<conio.h>
main(){
	/* max freq return */
	int ar[50],n,i,count=0,num;
	printf("enter size of array");
	scanf("%d",&n);
	printf("enter elements of array");
	for(i=0;i<n;i++){
		scanf("%[a-z]d",&ar[i]);	
	}
	printf("enter no. you want to check frequency");
	scanf("%d",&num);
	for(i=0;i<n;i++){
		if(ar[i]==num)
			count++;
	}
	printf("count ");
	printf("%d\n",count);
	

	
	
getch();
}
