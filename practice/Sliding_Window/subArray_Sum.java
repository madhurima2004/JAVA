public class subArray_Sum {
    public static void main(String[] args) {
        int [] arr={18,4,23,67,54};
        int k=3;
        int sum=0;
        int n = arr.length;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
        for(int i=1;i<=n-k;i++){
            sum=sum=arr[i-1]+arr[i+k-1];
            System.out.println(sum);
        }
    }
}
