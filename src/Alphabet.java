import java.util.HashMap;

public class Alphabet {
    private static final HashMap<Character, String[]> alphabet = new HashMap<>();

    static {
        alphabet.put('a', new String[] {
                " ███  ",
                "█   █ ",
                "█████ ",
                "█   █ ",
                "█   █ "
                });
        alphabet.put('b', new String[] {
                "████  ",
                "█   █ ",
                "████  ",
                "█   █ ",
                "████  "
                });
        alphabet.put('c', new String[] {
                " ███  ",
                "█   █ ",
                "█     ",
                "█   █ ",
                " ███  "
                });
        alphabet.put('d', new String[] {
                "████  ",
                "█   █ ",
                "█   █ ",
                "█   █ ",
                "████  "
                });
        alphabet.put('e', new String[] {
                "█████ ",
                "█     ",
                "███   ",
                "█     ",
                "█████ "
                });
        alphabet.put('f', new String[] {
                "█████ ",
                "█     ",
                "███   ",
                "█     ",
                "█     "
                });
        alphabet.put('g', new String[] {
                " ███  ",
                "█     ",
                "█  ██ ",
                "█   █ ",
                " ███  "
                });
        alphabet.put('h', new String[] {
                "█   █ ",
                "█   █ ",
                "█████ ",
                "█   █ ",
                "█   █ "
                });
        alphabet.put('i', new String[] {
                "█ ",
                "█ ",
                "█ ",
                "█ ",
                "█ "
                });
        alphabet.put('j', new String[] {
                "█████ ",
                "    █ ",
                "    █ ",
                "█   █ ",
                " ███  "
                });
        alphabet.put('k', new String[] {
                "█   █ ",
                "█  █  ",
                "███   ",
                "█  █  ",
                "█   █ "
                });
        alphabet.put('m', new String[] {
                "█     ",
                "█     ",
                "█     ",
                "█     ",
                "█████ "
                });
        alphabet.put('m', new String[] {
                "██   ██ ",
                "█ █ █ █ ",
                "█  █  █ ",
                "█     █ ",
                "█     █ "
                });
        alphabet.put('n', new String[] {
                "██    █ ",
                "█ █   █ ",
                "█  █  █ ",
                "█   █ █ ",
                "█    ██ "
                });
        alphabet.put('o', new String[] {
                " ███  ",
                "█   █ ",
                "█   █ ",
                "█   █ ",
                " ███  "
                });
        alphabet.put('p', new String[] {
                "████  ",
                "█   █ ",
                "████  ",
                "█     ",
                "█     "
                });
        alphabet.put('q', new String[] {
                "██   ██ ",
                "█ █ █ █ ",
                "█  █  █ ",
                "█     █ ",
                "█     █ "
                });
        alphabet.put('r', new String[] {
                "████   ",
                "█   █  ",
                "████   ",
                "█  █   ",
                "█   █  "
                });
        alphabet.put('s', new String[] {
                "██   ██ ",
                "█ █ █ █ ",
                "█  █  █ ",
                "█     █ ",
                "█     █ "
                });
        alphabet.put('t', new String[] {
                "█████ ",
                "  █   ",
                "  █   ",
                "  █   ",
                "  █   "
                });

    }

    public static HashMap<Character, String[]> getAlphabet() {
        return alphabet;
    }
}