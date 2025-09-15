class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        l=text.split()
        count=0
        for i in l:
            s=True
            for j in i:
                if j in brokenLetters: 
                    s=False
            if s==True:
                count+=1
        return count
                
        
