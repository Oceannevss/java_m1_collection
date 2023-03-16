package Exercice_4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Character, Integer> listeCharRepete(String phrase){
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i=0; i<phrase.length() ; i++){
            char c = phrase.charAt(i);
            if(c != ' '){
                if (map.containsKey(c)) {
                    int key = map.get(c);
                    map.put(c, key + 1);
                } else {
                    map.put(c, 1);
                }
            }

        }
        Map<Character, Integer> mapRepete = new HashMap<>();
        //int count = 0;
        int key = 0;
        for(var item: map.entrySet()){
            if(item.getValue() > 1 ){
                mapRepete.put(item.getKey(), item.getValue());
            }
        }
        return mapRepete;
    }
    public static void main(String[] args) {

        //Exercice 4 : trouvé les caracteres répété -> map

        var phrase1 = " a green apple";
        var phrase2 = "i am oceanne";
        System.out.println(listeCharRepete(phrase1));
        //a , e, p
        System.out.println(listeCharRepete(phrase2));
        //a, e, n
    }
}