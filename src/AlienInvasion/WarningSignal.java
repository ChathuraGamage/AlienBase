package AlienInvasion;

import java.util.Arrays;
import java.util.HashMap;


public class WarningSignal {

    private int base;
    private char[] uniqueCharacters;
    private HashMap<Character, Integer> map;

    public int getBase() {
        return base;
    }

    public char[] getUniqueCharacters() {
        return uniqueCharacters;
    }

    public int countBase(String massage) {
        int base = 1;
        char current;

        char arr[] = massage.toCharArray();
        Arrays.sort(arr);
        current = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (current != arr[i]) {
                base++;
                current = arr[i];
            }

        }
        return base;
    }

    public HashMap<Character, Integer> getMap() {

        return map;
    }

    public int translate(String msg, int base) {
        this.uniqueCharacters = new char[base];
        int k = 0, tmp, seconds = 0;
        String s;

        this.map = new HashMap();

        char arr[] = msg.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = '!';
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '!') {
                this.uniqueCharacters[k] = arr[i];
                k++;
            }
        }
        s = new String(this.uniqueCharacters);
        if (!s.equals(null)) {

            this.map.put(s.charAt(0), 1);
            this.map.put(s.charAt(1), 0);
            if (s.length() > 2) {
                for (int i = 2; i < s.length(); i++) {
                    this.map.put(s.charAt(i), i);

                }
            }

        }
        String translatedMsg = "";
        StringBuilder a = new StringBuilder(translatedMsg);

        for (int i = 0; i < msg.length(); i++) {
            a.append(this.map.get(msg.charAt(i)));
        }
        tmp = Integer.parseInt(a.toString());
        k = 0;
        while (tmp != 0) {
            seconds += (tmp % 10) * Math.pow(base, k);
            tmp = tmp / 10;
            k++;
        }

        return seconds;


    }
}
