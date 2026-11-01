public class StringBufferLesson {
    // stringbuffer allows you to manipulate strings, it's thread safe
    void main() {

        StringBuffer sb = new StringBuffer("Edu");
        sb.append(" Paiva");

        sb.insert(0, "Java ");

        sb.setLength(30);

        System.out.println(sb);

    }
}
