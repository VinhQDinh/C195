package helper;
import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageManager {


    public static ResourceBundle getResourceBundle(Locale locale) {

        return ResourceBundle.getBundle("language/language", locale);
    }
}

