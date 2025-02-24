class Solution {
    public boolean hasSameDigits(String s) {
        if (s.length() == 2)
            return s.charAt(0) == s.charAt(1);

        while (s.length() > 2) {
            StringBuilder operation = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int sum = (s.charAt(i) - '0') + (s.charAt(i + 1) - '0');
                operation.append(sum % 10);
            }
            s = operation.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}