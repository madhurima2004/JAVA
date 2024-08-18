import java.util.Arrays;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
       int sTotMap[] =new int[128];
       int tTosMap[] =new int[128];
       Arrays.fill( sTotMap,-1);
       Arrays.fill(tTosMap,-1);
       StringBuilder sbS = new StringBuilder(s);
       StringBuilder sbT = new StringBuilder(t);
       int n= s.length();
       for(int i=0;i<n;i++){
        char s1 = sbS.charAt(i);
        char t1 = sbT.charAt(i);
        if(sTotMap[s1]==-1){
            sTotMap[s1]=t1;
        }
        if(tTosMap[t1]==-1){
            tTosMap[t1]=s1;
        }
        if(sTotMap[s1]!=t1 || tTosMap[t1]!=s1){
            return false;
        }
       }
       return true;

}
}
