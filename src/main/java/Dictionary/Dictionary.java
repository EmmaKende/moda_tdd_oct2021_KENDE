package Dictionary;

import java.util.Map;

public class Dictionary {
   private String name;
   private Map<String, String> translations;

    public Dictionary(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public String getTranslation(String t){
        return "against";
    }
    public void addTranslation(String a, String b){

    }
    public boolean isEmpty(){
        return true;
    }
}
