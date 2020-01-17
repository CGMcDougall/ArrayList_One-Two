import java.util.ArrayList;



  
public class Goldbach
{
    public static void Gold(int a){
        int f =0; 
        int s = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
       
        nums = Prime(a);
          System.out.println(nums);
        while(f < nums.size()-1){
         if(nums.get(s) + nums.get(f) == a){
             System.out.println(nums.get(s)+ " " + nums.get(f));
            break;
            }
            
            
         s++;
         if(s > nums.size()-1){
             f++;
             s =0;
            }
        }
         
            
            
          
        }
        
        
    
        
    public static ArrayList Prime(int E){
   
       int P = 2;
       ArrayList<Integer> nums = new ArrayList<Integer>();
       ArrayList<Integer> Test = new ArrayList<Integer>();
       for(int i =P; i <= E; i++){
           Test.add(i);
        }
       int z = 0;
       while(1< 2){
        for(int i= Test.size()-1; i >= 0; i--){
            //if(i > Test.size()-1)break;
       
      if(Test.get(i) % P == 0 && Test.get(i) != P)Test.remove(i);
    }
    z++;
    if(z > Test.size()-1)break;
    P = Test.get(z);
    if(P >= E)break;
}
return Test;
}   
        
    }
    
    
    
    