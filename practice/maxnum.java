// package JAVA;
class Arrayex{
    void maxOfArray(){
        int[] arr={0,1,73,8,53,};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
public class maxnum {

    public static void main(String[] args) {
        Arrayex obj = new Arrayex();
        obj.maxOfArray();
        
    }
}