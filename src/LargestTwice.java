import java.util.Scanner;
public class LargestTwice {
    
        public static int findTwice(int[] arr,int n){
                 if(n==0)
                    return -1;
                 int largest=0;
                 for(int i=1;i<n;i++){
                    if(arr[i]>=arr[largest]){
                          largest=i;
                          }
                       }
                 for(int i=0;i<n;i++){ 
                     if(i != largest && arr[largest] < 2 * arr[i]){
                            return -1;
                          }
                       }
                  return largest;
              }
         public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              int n=sc.nextInt();
              int[] arr= new int[n];
              for(int i=0;i<n;i++){
                  arr[i]=sc.nextInt();
                  }
              System.out.println(findTwice(arr,n));
        }              
    
}
