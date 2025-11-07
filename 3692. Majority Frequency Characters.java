
class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Integer, List<Character>> freq = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            char x = entry.getKey();
            freq.putIfAbsent(count, new ArrayList<>());
            freq.get(count).add(x);
        }

        int maxGroupSize = 0;
        int selectedFreq = 0;
        List<Character> resultList = new ArrayList<>();

        for (Map.Entry<Integer, List<Character>> entry : freq.entrySet()) {
            int frequency = entry.getKey();
            List<Character> group = entry.getValue();

            if (group.size() > maxGroupSize) {
                maxGroupSize = group.size();
                selectedFreq = frequency;
                resultList = group;
            }
            else if (group.size() == maxGroupSize && frequency > selectedFreq) {
                selectedFreq = frequency;
                resultList = group;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : resultList) {
            sb.append(c);
        }

        return sb.toString();
    }

}
