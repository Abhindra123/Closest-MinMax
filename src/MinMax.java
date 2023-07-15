import java.util.Scanner;

public class MinMax {
    public static int closestMinMax(int arr[],int max,int min){
        int count=Integer.MAX_VALUE;
        int max_updated=-1;
        int min_updated=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==min){
                min_updated=i;
                if(max_updated>=0){
                    int temp=i-max_updated-1;
                    if(count>temp){
                        count=temp;
                    }
                }

            }
            if(arr[i]==max){
                max_updated=i;
                if(min_updated>=0){
                    int temp=i-min_updated+1;
                    if(count>temp){
                        count=temp;
                    }
                }
            }

        }
return count;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sie of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
int val=closestMinMax(arr,max,min);
        System.out.println("the value is : "+val);
    }
}