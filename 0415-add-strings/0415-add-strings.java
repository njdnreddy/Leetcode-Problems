class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();       
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;      
        // Loop until both strings are processed and no carry is left
        while (i >= 0 || j >= 0 || carry > 0) {
            // Get the current digits or 0 if index is out of range
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            
            // Update carry for the next digit
            carry = sum / 10;
            
            // Append the last digit of the sum to result
            result.append(sum % 10);
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}