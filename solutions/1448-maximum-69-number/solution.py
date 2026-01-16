class Solution:
    def maximum69Number (self, num: int) -> int:
        s = str(num)
        ans = []
        check = 0
        for i in s :
            if check == 0 and i == '6' :
                ans.append('9')
                check += 1
            else :
                ans.append(i)
        return int("".join(ans))

