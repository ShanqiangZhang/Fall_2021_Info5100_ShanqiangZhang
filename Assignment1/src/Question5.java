public class Question5 {

    public static boolean isFollowed(String str) {
        //identify first letter -> is digit or not
        if (Character.isDigit(str.charAt(0)) == false) {
            for (int i = 1; i < str.length(); i += 2) {
                if (Character.isDigit(str.charAt(i)) == false) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < str.length(); i += 2) {
                if (Character.isLetter(str.charAt(i)) == false) {
                    return false;
                }
            }
        }
        return true;
    }


}

