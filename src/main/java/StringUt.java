public class StringUt {
    public static String findWordWithMostI(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        int maxCount = 0;

        for (String word : words) {
            int count = countOccurrences(word, 'и');
            if (count > maxCount) {
                maxCount = count;
                result = word;
            }
        }
        return result;
    }
    private static int countOccurrences(String word, char ch) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }
    public static int maxDiagonalSum(int[][] matrix) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
        }

        return Math.max(primaryDiagonalSum, secondaryDiagonalSum);
    }
    public static String getInitials(String phrase) {
        StringBuilder initials = new StringBuilder();
        for (String word : phrase.split(" ")) {
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return initials.toString();
    }
}
