package Dictionary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Dictionary {
   private String name;
   private Map<String, List<String>> translations;

    public Dictionary(String name) {
        this.name = name;
        this.translations = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }
    public List<String> getTranslation(String t){
        return this.translations.get(t);
    }
    public void addTranslation(String a, List<String> b){
            this.translations.put(a,b);
    }
    public String translationInverse(List<String> b){
        for(Map.Entry e : this.translations.entrySet()){
            if(Objects.equals(b,e.getValue())){
                return e.getKey().toString();
            }
        }
        return "";
    }
    public boolean isEmpty(){
        if(translations == null) return true;
        return false;
    }
}
