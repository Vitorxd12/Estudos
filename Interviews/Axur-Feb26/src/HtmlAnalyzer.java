import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Deque;

public class HtmlAnalyzer {

    public static void main(String[] args) {
        if (args.length == 0) return;
        String urlString = args[0];

        try {
            analyzeHtml(urlString);
        } catch (Exception e) {
            System.out.println("URL connection error");
        }
    }

    private static void analyzeHtml(String urlString) throws Exception {
        URL url = new URL(urlString);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {

            Deque<String> stack = new ArrayDeque<>();
            String deepestText = null;
            int maxDepth = -1;
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isClosingTag(line)) {
                    String tagName = line.substring(2, line.length() - 1);
                    if (stack.isEmpty() || !stack.peek().equals(tagName)) {
                        System.out.println("malformed HTML");
                        return;
                    }
                    stack.pop();
                } else if (isOpeningTag(line)) {
                    String tagName = line.substring(1, line.length() - 1);
                    stack.push(tagName);
                } else {
                    int currentDepth = stack.size();
                    if (currentDepth > maxDepth) {
                        maxDepth = currentDepth;
                        deepestText = line;
                    }
                }
            }

            if (!stack.isEmpty()) {
                System.out.println("malformed HTML");
            } else if (deepestText != null) {
                System.out.println(deepestText);
            }
        }
    }

    private static boolean isOpeningTag(String line) {
        return line.startsWith("<") && !line.startsWith("</") && line.endsWith(">");
    }

    private static boolean isClosingTag(String line) {
        return line.startsWith("</") && line.endsWith(">");
    }
}