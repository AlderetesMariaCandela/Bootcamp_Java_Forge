public class StringManipulatorTest {
    public static void main (String[] args){
        //ACTIVIDAD 1
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo 

        //ACTIVIDAD 2
        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", letter);
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1

        //ACTIVIDAD 3
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        a = manipulator.getIndexOrNull(word, subString);
        b = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(a); // 2
        System.out.println(b); // -1

        //ACTIVIDAD 4
        word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word); // olmundo
    }

}