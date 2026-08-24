public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String str = "hello";

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();

        System.out.println(sb.toString());
    }
}
