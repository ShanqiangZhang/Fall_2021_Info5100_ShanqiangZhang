package LeetcodeQuestion;

public class Question10_StringCompression {
    public static int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) return 1;

        int size = 0, curCount = 0;
        for (int i = 0; i < n; i++) {
            char curChar = chars[i];
            curCount++;
            if (i == n - 1 || curChar != chars[i + 1]) {
                chars[size++] = curChar;
                if (curCount > 1) {
                    int count = curCount, lengthOfCount = 0;
                    while (count != 0) {
                        lengthOfCount++;
                        count /= 10;
                    }
                    int toSetIndex = size + lengthOfCount - 1;
                    while (curCount != 0) {
                        int num = curCount % 10;
                        curCount /= 10;
                        chars[toSetIndex--] = (char) (num + '0');
                    }
                    size += lengthOfCount;
                }
                curCount = 0;
            }
        }

        return size;
    }

}
