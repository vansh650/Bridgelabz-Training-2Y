public class CompareStringBufferAndStringBuilder {
    public static void main(String[] args) {
        int n = 1000000;

        long start = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long bufferTime = System.nanoTime() - start;

        System.out.println("StringBuilder time: " + builderTime + " ns");
        System.out.println("StringBuffer time: " + bufferTime + " ns");
    }
}
