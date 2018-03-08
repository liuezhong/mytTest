import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/23.
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i),1);
            }else {
                smap.put(s.charAt(i),smap.get(s.charAt(i))+1);
            }
        }
        for (int j = 0; j < t.length(); j++){
            if(!tmap.containsKey(t.charAt(j))){
                tmap.put(t.charAt(j),1);
            }else {
                tmap.put(t.charAt(j),tmap.get(t.charAt(j))+1);
            }
            if(!smap.containsKey(t.charAt(j)) || tmap.get(t.charAt(j)) > smap.get(t.charAt(j))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        IsAnagram a = new IsAnagram();
        System.out.print(a.isAnagram("anagram","nagaram"));
        System.out.print(a.isAnagram("rat","car"));
    }
}
