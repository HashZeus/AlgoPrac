public class FirstNonRepeatCharacter {

    static char firstNonRepeatingCharacter(String s) {

        int[] counter = new int[26];

        for (char c : s.toCharArray()) {
            counter[c - 'a']++;
            System.out.println(c+" "+(c-'a')+" "+counter[c - 'a']);
        }
        for (char c : s.toCharArray()) {
            if (counter[c - 'a'] == 1) return c;
        }

        return '_';

    }

    public static void main(String[] args) {
        String s = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        System.out.println(firstNonRepeatingCharacter(s));
    }
}
