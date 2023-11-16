package es03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validPin {
	public static boolean validPin(String pin) {
        // L'espressione regolare verifica se il PIN è composto da 4 o 6 cifre
        Pattern pattern = Pattern.compile("^\\d{4}$|^\\d{6}$");
        
        // Crea un oggetto Matcher per la stringa di input
        Matcher matcher = pattern.matcher(pin);
        
        // Verifica se la stringa corrisponde al pattern
        return matcher.matches();
    }

}
