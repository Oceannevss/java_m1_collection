package Exercice_2;

import java.util.Stack;

public class Main {
    public static boolean estVerifie(String mot){
        var stack = new Stack<Character>();
        for (int i=0; i<mot.length() ; i++){
            stack.push(mot.charAt(i));
        }
        for (var caract: stack){
            if (caract == '[' && stack.peek() == ']'
                    || caract == '<' && stack.peek() == '>'
                    || caract == '(' && stack.peek() == ')'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        //Exercice 2 : verifier que (<[ commence et fini par caractere et que se soit bien fermer
        //ex : (kldk <> )[]

        var mot1 = "(kldk <> )[]";
        var mot2 = "(kldz<)>";
        System.out.println(estVerifie(mot1));
        System.out.println(estVerifie(mot2));

    }

}