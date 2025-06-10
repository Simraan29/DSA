class Solution {
    public boolean isValid(String s) {

         int originalLength;
        do {
            originalLength = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        } while (s.length() < originalLength);
        return s.isEmpty();

    }
   
}