import java.util.*;
class Solution {
    public static String[] solution(String[] files) {
        Arrays.sort(files, (file1, file2) -> {
            String[] splitFile1 = splitFileName(file1);
            String[] splitFile2 = splitFileName(file2);

            int headCompare = splitFile1[0].compareToIgnoreCase(splitFile2[0]);
            if (headCompare != 0) {
                return headCompare;
            }

            int number1 = Integer.parseInt(splitFile1[1]);
            int number2 = Integer.parseInt(splitFile2[1]);
            return Integer.compare(number1, number2);
        });
        return files;
    }

    private static String[] splitFileName(String file) {
        String head = file.split("[0-9]")[0];
        String number = file.substring(head.length()).split("[^0-9]")[0];
        String tail = file.substring(head.length() + number.length());
        return new String[]{head, number, tail};
    }
}