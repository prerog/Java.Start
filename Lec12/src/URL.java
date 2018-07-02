public class URL {
    public static String getServerName(String userLine) {
        int startIndex = userLine.indexOf("/");
        String s = userLine.substring(startIndex + 2);

        int lastIndex = s.indexOf("/");
        if (lastIndex == -1) {
            return s;
        } else {
            return s.substring(0, lastIndex);
        }
    }

    public static void main(String[] args) {
        String userLine = "http://SomeServerName/asd/asd.htm";
        userLine = getServerName(userLine);
        System.out.println(userLine);
    }
}
