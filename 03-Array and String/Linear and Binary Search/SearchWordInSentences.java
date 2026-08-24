public class SearchWordInSentences {
    public static String search(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "I am learning Java",
            "Java is easy to learn",
            "I like programming"
        };

        System.out.println(search(sentences, "Java"));
    }
}
