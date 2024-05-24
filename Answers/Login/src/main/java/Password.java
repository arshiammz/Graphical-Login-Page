import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static String passwordLevel(String password){
        Pattern patternLevel1 = Pattern.compile("\\b([A-Z]|[a-z]|\\d){4,8}\\b");
        Matcher matcher1 = patternLevel1.matcher(password);
        Pattern patternLevel2 = Pattern.compile("\\b([A-Z].*[a-z]){4,8}\\b");
        Matcher matcher2 = patternLevel2.matcher(password);
        Pattern patternLevel3 = Pattern.compile("");
        Matcher matcher3 = patternLevel3.matcher(password);
        Pattern patternLevel4 = Pattern.compile("");
        Matcher matcher4 = patternLevel4.matcher(password);
        Pattern patternLevel5 = Pattern.compile("\\b\\S{8,}\\b");
        Matcher matcher5 = patternLevel5.matcher(password);
        if (matcher1.find()){
            return "too weak";
        } else if (matcher2.find()){
            return "weak";
        } else if (matcher3.find()) {
            return "normal";
        } else if (matcher4.find()){
            return "strong";
        } else if (matcher5.find()){
            return "too strong";
        } else {
            return "invalid";
        }
    }



}