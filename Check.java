public class Check {

    // FIXME: Названия параметров неинформативны
    /*
    public boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    */
    
    // FIXTO: 
    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // FIXME: Название метода нарушает camelCase для Java. Параметр (num) информативного имени.
    /*
    public boolean Positive (int num) {
        return num >= 0;
    }
    */

    // FIXTO: 
    public boolean isPositive(int number) {
        return number >= 0;
    }
}