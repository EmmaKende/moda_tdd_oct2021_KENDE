package Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
   private String name;
   private Map<String, String> translations;

    public Dictionary(String name) {
        this.name = name;
        this.translations = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }
    public String getTranslation(String t){
        return this.translations.get(t);
    }
    public void addTranslation(String a, String b){
        this.translations.put(a,b);
    }
    public boolean isEmpty(){
        return true;
    }
}
