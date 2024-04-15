import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        List<String> l = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) {
            l.add(names[i]);
        }

        return l.toArray(new String[l.size()]);
    }
}