import java.io.*;

public class RadixSort{

     public static void main(String []args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ;
        int N,K;
        String firstLine = br.readLine();
        N = Integer.parseInt(firstLine.split(" ")[0]);
        //K = Integer.parseInt(firstLine.split(" ")[1]);
        
        int arr[] = new int[N];
        String line[] = br.readLine().split(" ");
        for(int j=0;j<N;j++){
            arr[j] = Integer.parseInt(line[j]);
        }
        
        // int arr[]= {4,3,2,1,0};
        // int K=5;
        
        radixSort(arr, N);
        
        for(int j=0;j<N;j++){
           System.out.print(arr[j] + " ");
        }
        
     }
     
     public static void countingSort(int arr[], int N, int exp){
         int count[] = new int[10];
         int temp[] = new int[N];
         for(int i=0;i<10;i++){
             count[i] = 0;
         }
         
         for(int i=0;i<N;i++){
             count[arr[i] / exp % 10]++;
         }
         
         for(int i=1;i<10;i++){
             count[i] = count[i] + count[i-1];
         }
         
         for(int j=N-1;j>=0;j--){
             temp[count[arr[j] / exp % 10]-1] = arr[j];
             count[arr[j] / exp % 10]--;
         }
         
         for(int i=0;i<N;i++){
             arr[i] = temp[i];
         }
         
     }
     
     public static void radixSort(int arr[], int N){
         
         int max = arr[0];
         for(int i=1;i<N;i++){
             max = Math.max(max, arr[i]);
         }
         
         int exp =1;
         while(exp <=max){
            countingSort(arr, N, exp);
            exp = exp * 10; 
         }
         
         
     }
     
}