import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/19.
 */
public class IsIsomorphic {
//    public boolean isIsomorphic(String s, String t) {
//        if(s.length() != t.length()) return false;
//        return getPattern(s).equals(getPattern(t));
//    }
//    public String getPattern(String s){
//        Map<Character, Character> map = new HashMap<>();
//        String pattern = "";
//        for(int i = 0; i < s.length(); i++){
//            if(map.containsKey(s.charAt(i))){
//                pattern += map.get(s.charAt(i));
//            }else {
//                pattern += (char)('A' + map.size());
//                map.put(s.charAt(i),(char)('A' + map.size()));
//            }
//        }
//        return pattern;
//    }
//    public boolean isIsomorphic(String s, String t) {
//        if(s.length() != t.length()) return false;
//        Map sChar = new HashMap();
//        String patternS = "";
//        Map tChar = new HashMap();
//        String patternT = "";
//        for(int i = 0; i < s.length(); i++){
//            if(!(sChar.containsKey(s.charAt(i)) ^ tChar.containsKey(t.charAt(i)))){
//                if(sChar.containsKey(s.charAt(i)) && tChar.containsKey(t.charAt(i))){
//                    patternS += sChar.get(s.charAt(i));
//                    patternT += tChar.get(t.charAt(i));
//                }else {
//                    patternS += 1 + sChar.size();
//                    patternT += 1 + tChar.size();
//                    sChar.put(s.charAt(i),1 + sChar.size());
//                    tChar.put(t.charAt(i),1 + tChar.size());
//                }
//            }else {
//                return false;
//            }
//        }
//        return patternS.equals(patternT);
//    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] m = new int[512];
        int[] n = new int[512];
        for (int i = 0; i < s.length(); i++) {
            if (m[s.charAt(i)] != n[t.charAt(i)]) return false;
            m[s.charAt(i)] = n[t.charAt(i)] = i+1;
        }
        return true;
    }
    public static void main(String[] args){
        IsIsomorphic a = new IsIsomorphic();
        System.out.print(a.isIsomorphic("foo","bar"));
        System.out.print(a.isIsomorphic("paper","title"));
        System.out.print(a.isIsomorphic("egg","add"));
    }
}
