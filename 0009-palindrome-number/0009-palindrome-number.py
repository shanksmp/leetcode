class Solution:
    def isPalindrome(self, x: int) -> bool:
        original = x
        reverseNumber = 0
        while x>0:
            lastDigit = x%10
            x = x//10
            reverseNumber = (reverseNumber * 10) + lastDigit
        return reverseNumber == original