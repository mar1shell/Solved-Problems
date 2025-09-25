class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> uniqueMorseCodes = new HashSet<>();
        String[] charToMorse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String word: words) {
            StringBuilder currWordEncoding = new StringBuilder();

            for (char currChar: word.toCharArray()) {
                int currCharAsciiEncoding = (int) currChar - (int) 'a';
                
                currWordEncoding.append(charToMorse[currCharAsciiEncoding]);
            }

            uniqueMorseCodes.add(currWordEncoding.toString());
        }

        return uniqueMorseCodes.size();
    }
}