import java.util.Scanner;
import java.util.*;

public class Solution{

     public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int c;
        c=s.nextInt();
        //Scanner s1 = new Scanner(System.in);
        //System.out.println(c);
        
        int i=1;
        s.nextLine();
        while(i<=c){
            int count=0;
            String str=s.nextLine();
            //System.out.println(str);
            int n=str.length();
            LinkedList<Character> st = new LinkedList<Character>();  
  
            for (int x = 0; x < n; x++) { 
                if(str.charAt(x)=='i'){
                   st.addLast(str.charAt(x)); 
                }
                else if(str.charAt(x)=='I'){
                   st.addFirst(str.charAt(x)); 
                }
                else if(str.charAt(x)=='O') {
                    char x1=st.getFirst();
                    if(x1=='I'){
                        count++;
                    }
                    st.removeFirst();
                }
                else{
                    st.removeLast();
                }
            }
            
            System.out.println("Case #"+i+": "+count); 
            i++;
        }
     }
}
