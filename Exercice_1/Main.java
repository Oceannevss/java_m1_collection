package Exercice_1;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Exercice 1 : inverser une chaine de caractere
        var mot = "abcd";
        var list = new Stack<Character>();
        for (int i=mot.length()-1; i >= 0 ; i--){
            list.push(mot.charAt(i));
        }
        System.out.println(list);
        var nouveauMot = "";
        for (var lettre : list){
            nouveauMot += lettre;
        }
        System.out.println(nouveauMot);
    }
}