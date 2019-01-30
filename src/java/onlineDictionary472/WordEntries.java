/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineDictionary472;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kab
 */
public class WordEntries {
    private String word;
    private List<String> type = new ArrayList();
    private List<String> def = new ArrayList();
    
    
    public WordEntries(String word){
        this.word = word;
        //this.type = type;
       // this.def = def;
    }

    public String getWord() {
        return word;
    }

    public List<String> getType() {
        return type;
    }

    public List<String> getDef() {
        return def;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setType(String type) {
        this.type.add(type);
    }

    public void setDef(String def) {
        this.def.add(def);
    }
    
    
}
