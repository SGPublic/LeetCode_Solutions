package Y2021.Nov.Nov08;

class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        int size = secret.length();
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        char[] secretChats = secret.toCharArray();
        char[] guessChats = guess.toCharArray();
        for (int i = 0; i < size; i++) {
            if (secretChats[i] == guessChats[i]) {
                bulls++;
            }
            secretCount[secretChats[i] - '0']++;
            guessCount[guessChats[i] - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            cows += Math.min(guessCount[i], secretCount[i]);
        }
        return String.format("%dA%dB", bulls, cows - bulls);
    }
}