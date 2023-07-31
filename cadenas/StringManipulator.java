public class StringManipulator{
    public String trimAndConcat(String cadena1, String cadena2){
        return cadena1.trim().concat(cadena2.trim());
    }
    public int getIndexOrNull(String cadena1, char letter){
        return cadena1.indexOf(letter);
    }
    public int getIndexOrNull(String cadena1, String cadena2){
        return cadena1.indexOf(cadena2);
    }
    public String concatSubstring(String cadena1, int n1, int n2, String cadena2){
        return cadena1.substring(n1, n2).concat(cadena2);
    }
}
