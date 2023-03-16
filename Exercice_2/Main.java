package Exercice_2;

import java.util.Stack;

public class Main {
    public static String estVerifie(String mot) {
        var stack = new Stack<Character>();
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == '(' || mot.charAt(i) == '<' || mot.charAt(i) == '[') {
                stack.push(mot.charAt(i));
            } else if (mot.charAt(i) == ')' || mot.charAt(i) == '>' || mot.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return "Non vérifié";
                } else {
                    var lastCaracter = stack.pop();
                    if ((mot.charAt(i) == ')' && lastCaracter != '(')
                            || (mot.charAt(i) == '>' && lastCaracter != '<')
                            || (mot.charAt(i) == ']' && lastCaracter != '[')) {
                        return "Non vérifié";
                    }
                }
            }
        }
        return "Vérifié";
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