class Solution:
    def isPalindrome(self, x: int) -> bool:
        y = str(x)[::-1];
        if (y == str(x)):
            return True
        return False
