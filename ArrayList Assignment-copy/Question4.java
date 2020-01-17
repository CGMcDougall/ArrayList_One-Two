import java.util.ArrayList;

class Question4 {
    
    public static void filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //This method removes all the elements in list1 that also appear in list2
        
        for(int i = list1.size()-1; i >= 0; i--){
         for(int z =0; z <= list2.size()-1; z++){
             if(list1.get(i) == list2.get(z)){
                 list1.remove(i);
             break;
                }
             
            }
         
            
            
        }
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(2);
        list2.add(4);
        System.out.println("The list1 before: " + list1);
        System.out.println("The list2: " + list2);
        filter(list1,list2);
        System.out.println("The list after:  " + list1);
        //the list after should be [1,3]
    }
    
    
    
}
