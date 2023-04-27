import java.io.BufferedReader;
import java.io.InputStreamReader;
public class thewitcher {
    // Pour permettre la saisie à partir de la console
    static BufferedReader keyboard = new BufferedReader( new InputStreamReader( System.in ));
    public static void main(String[] args) throws Exception{
        // Declaration des variables.
        Feu feu = Feu.ORANGE;
        System.out.print( "Je suis (passer, attendre):");

        String action = keyboard.readLine();
        // Pour changer le résultat dans la console je dois bouger le signe == !=
        if (action.equals("passer")) {
            // On compare les états du type énuméré
            if (feu != feu.ORANGE){ // si feu est == feu.orange la console affiche dev junior
                System.out.println( "dev junior"); //feu != feu.Orange la console affiche un devloppeur
            } else {
                System.out.println( "un devloppeur" );
            }
        } else if ( action.equals("attendre") ) {
                                        //si feu == feu.Orange affiche bonjour toi..
            if ( feu != Feu.ORANGE ) { // si feu est différent de feu.orange alors bonne initiative
                System.out.println( "Bonjou toi" );
            } else {
                System.out.println("Bonne initiative");
            }
        } else {
            System.out.println( "Commande inconnue");
        }
    }
}