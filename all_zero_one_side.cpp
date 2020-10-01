#include<stdio.h>
#include<conio.h>
main(){
	int a[50],j,k=0,i,n;
	scanf("%d",&n);
	int b[n];
	for(i=0;i<=n;i++){
		scanf("%d",&a[i]);
	}
	
	for(i=0,j=n,k=0;i<=n;i++){
		if(a[i]==0){
			b[k]=0;
			k++;
		}else{
			b[j]=1;
			j--;
		}
	}
	printf("new\n");
	for(i=0;i<=n;i++){
		printf("%d\t",b[i]);
	}

getch();
}
