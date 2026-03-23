class Solution {
    public String longestPalindrome(String s) {
        String t = "^";
        for (int i = 0; i < s.length(); i++) {
            t += "#" + s.charAt(i);
        }
        t += "#$";
        int n = t.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;
            if (i < right)
                p[i] = Math.min(right - i, p[mirror]);

            while (t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i]))
                p[i]++;

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}