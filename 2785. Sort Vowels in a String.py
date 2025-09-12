class Solution(object):
    def sortVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        l=['a','e','i','o','u','A','E','I','O','U']
        ans=[]
        for i in s:  
            if i in l:
                ans.append(i)
        ans.sort()
        j=0
        res=[]
        for i in s:
            if i in l:
                res.append(ans[j])
                j+=1
            else:
                res.append(i)
        return "".join(res)
        
