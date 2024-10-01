public class CapitalCheck {
    public static void main(String[] args) {
        String word = "sameer";
        word = word.toUpperCase();
        System.out.println(word);
        for(int i=0; i<word.length();i++){
            if(!Character.isUpperCase(word.charAt(i))){
               return false;
            }
        }
        
    }
}
