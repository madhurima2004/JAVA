import java.util.HashMap;;
public class most_frequent_element {
    public static void main(String[] args) {
        int arr[]={2,4,1,6,2,2,2,5,7,8,9};
        int ans = mostFrequentElement(arr);
        System.out.println("answer :"+ ans);
    }
    public static int mostFrequentElement(int arr[]){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        int ans=-1;
        int maxfrequency =0;
        for(int i=0;i<arr.length;i++){
            if(freqMap.containsKey(arr[i])){
                int val = freqMap.get(arr[i]);
                val+=1;
                freqMap.put(arr[i],val);
            }
            else{
                freqMap.put(arr[i],1);
            }
            if(freqMap.get(arr[i])>maxfrequency){
                maxfrequency =freqMap.get(arr[i]);
                ans=arr[i];
            }
        }
        return ans;
    }
}
