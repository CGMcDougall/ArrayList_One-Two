import java.util.ArrayList;

class Question1 {
    
    public static ArrayList<String> reverse( ArrayList<String> myList ) {
       ArrayList<String> R = new ArrayList<String>();
      int c = 0;
       for(int i = myList.size()-1; i >= 0;  i--){
         R.add(c,myList.get(i));
         
       // System.out.println(myList.get(myList.size() -i));
        c++;
        }
           
      
      return R;
    }
    
    public static void main (String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Why");
        words.add("do");
        words.add("we");
        words.add("fall");
        words.add("Bruce?");
        words.add("So");
        words.add("we");
        words.add("can");
        words.add("learn");
        words.add("to");
        words.add("pick");
        words.add("ourselves");
        words.add("up");
        System.out.println("List forwards reads: " + words);
      System.out.println("List backward reads: " + reverse(words));
     // System.out.println(words.get(3));
    }
    
    
}
