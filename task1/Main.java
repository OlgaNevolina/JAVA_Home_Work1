// Задана входная строка s, изменить порядок следования слова.
// Слово определяется как последовательность символов, не содержащих пробелов.
// Слова в s будут разделены по крайней мере одним пробелом.
// Возврат строка слов в обратном порядке, объединенная одним пробелом.

package task1;

public class Main {
    public static void main(String[] args) {
        String s = "это тестовая строка";
        String reversedWords = reverseWords(s);
        System.out.println(reversedWords);
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        return reversedString.toString().trim();
    }
}