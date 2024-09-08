public class LastwordLength {
    public static void main(String[] args) {
        String str="i am sameer";
        str.trim();
        int lastSpace = str.lastIndexOf(" ");
        System.out.println(str.length() -lastSpace-1);

    }
}
