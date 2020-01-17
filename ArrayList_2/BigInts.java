import java.util.ArrayList;

public class BigInts
{
    
     static void main(String[] args){
   
           ArrayList<Integer> nums = new ArrayList<Integer>();
       ArrayList<Integer> nums2 = new ArrayList<Integer>();
    ArrayList<Integer> Total = new ArrayList<Integer>();
        nums.add(0, 5);
        nums.add(1,3);
        
        nums2.add(0,6);
        nums2.add(1,6);
        nums2.add(2,3);
        int a = nums.size()-1;
        int b = nums2.size()-1;
        int d =0;
        while(1<2){
            int A =nums.get(a);
            int B = nums2.get(b); 
            
        int c= A + B; 
        c += d;
        if(c >= 10){
            d = 1;
            c = c -10;
        }
           Total.add(0,c);
            
        a--;
        b--;
        if(a < 0){
            while(1 == 1){
                
            if(b < 0){
             if(d == 0)break;
                //else Total.add(0,1);
                break;
            }
            if(d > 0){
                Total.add(0,nums2.get(b) + 1);
             d = 0;   
            }
            else Total.add(0,nums2.get(b));
            
            b--;
        }
    }   if(b < 0){
            while(1 == 1){
              if(a < 0){
             if(d == 0)break;
                else Total.add(0,1);
                break;
            }
            if(d > 0){
                Total.add(0,nums.get(a) + 1);
             d = 0;   
            }
            else Total.add(0,nums.get(a));
            
            a--;
        }
    } if(b < 0)break;
        }
    System.out.print(Total);
}

}