class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Step 1: Split s1 and s2 into arrays of words
        String[] words1 = s1.split("\\s+");
        String[] words2 = s2.split("\\s+");

        // Step 2: Create a HashMap to store the frequency of words
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        // Step 3: Iterate through words in s1 and update frequency in the map
        for (String word : words1) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Step 4: Iterate through words in s2 and update frequency in the map
        for (String word : words2) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Step 5: Create an ArrayList to store words with odd frequency
        ArrayList<String> ans = new ArrayList<>();

        // Step 6: Check for odd frequencies and add them to ans
        for (String word : frequencyMap.keySet()) {
            if (frequencyMap.get(word) == 1) {  // If the frequency is odd
                ans.add(word);
            }
        }

        // Step 7: Convert the ArrayList to a String[] array
        String[] ansArray = ans.toArray(new String[0]);

       return ansArray;

    }
}
