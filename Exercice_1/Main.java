package Exercice_1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Exercice 1 : inverser une chaine de caractere
        var mot = "abcd";
        var list = new LinkedList<Character>();
        for (int i=mot.length()-1; i >= 0 ; i--){
            list.addLast(mot.charAt(i));
        }
        System.out.println(list);
        var nouveauMot = "";
        for (var lettre : list){
            nouveauMot += lettre;
        }
        System.out.println(nouveauMot);
    }
}