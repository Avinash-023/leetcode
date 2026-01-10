class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int l = startIndex;
        int r = startIndex;
        int n = words.length;
        int dis=0;
        while (!words[l].equals(target) && !words[r].equals(target)) {
            r = (r + 1) % n;
            l = (l - 1 + n) % n;

            if (l == startIndex || r == startIndex) {
                break;
            }
            dis++;
        }

        if (words[l].equals(target)) {
            return dis;
        } 
        else if (words[r].equals(target)) {
            return dis;
        }

        return -1;
    }
}
