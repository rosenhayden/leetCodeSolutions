/* Given two strings s and t, return true if t is an

of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
*/
class Solution {
    public boolean isAnagram(String s, String t) {
    //Sorting approach is more straight forward.
    char[] a = s.toCharArray();
    Arrays.sort(a);
    char[] b = t.toCharArray();
    Arrays.sort(b);
    return new String(a) == new String(b);
}
