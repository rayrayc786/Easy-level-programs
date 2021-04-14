public class HelloWorld{

     public static void main(String []args){
       int []c=Isprime(1,10);
       int []d=Isprime(2,10);
       int l=0;
       while(l<10){
           System.out.print(c[l]+"/"+d[l]+",");
           l++;
       }
       IsprimeB(10,20);
       IsprimeN(10);
       Isprime(10);
       
       
     }

       
     public static void Isprime(int x){
         int flag=0;
            for(int div=2;div<x;div++){
                if(x%div==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Prime");
            }
            
        
     }
     public static void IsprimeN(int n){
        int count=0;
        int start=2;
        while(count<n){
            int flag=0;
            for(int i=2;i<start;i++){
                if(start%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(start);
                count++;
            }
            start++;
            
        }
     }
    public static void IsprimeB(int x,int y){
         for(int i=x;i<y;i++){
             int flag=0;
            for(int div=2;div<i;div++){
                if(i%div==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i);
            }
     }
}
    public static int[] Isprime(int start,int n){
         int i=start;
         int count=0;
         int[] a=new int[10];
        int j=0;
         while(count<n){
            int flag=0;
            for(int div=2;div<i;div++){
                if(i%div==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                
                a[j]=i;
                j++;
                count++;
            }
            i++;
         }
         return a;
     }
}
