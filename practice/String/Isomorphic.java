import java.util.Arrays;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        int sTotMap[] = new int[128];
        int tTosMap[] = new int[128];
        Arrays.fill(sTotMap, -1);
        Arrays.fill(tTosMap, -1);
        
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            
            if (sTotMap[s1] == -1) {
                sTotMap[s1] = t1;
            }
            
            if (tTosMap[t1] == -1) {
                tTosMap[t1] = s1;
            }
            
            if (sTotMap[s1] != t1 || tTosMap[t1] != s1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Isomorphic iso = new Isomorphic();
        
        String s1 = "egg";
        String t1 = "add";
        
        String s2 = "foo";
        String t2 = "bar";
        
        System.out.println("Are \"" + s1 + "\" and \"" + t1 + "\" isomorphic? " + iso.isIsomorphic(s1, t1));
        System.out.println("Are \"" + s2 + "\" and \"" + t2 + "\" isomorphic? " + iso.isIsomorphic(s2, t2));
    }
}
