import java.util.ArrayList;

public class Sieve_of_Eratosthenes
{
    static void main(String[] args){
       int E = 100;
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
System.out.print(Test);
}
}
