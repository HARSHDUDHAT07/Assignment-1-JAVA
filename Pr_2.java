// //Given a string, return a string made of the first 2 chars (if present), however include
// first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"
// yields "oz".
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"

import java.util.*;  
public class Pr_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();//TAKE INPUT AS A STRING

        String answer = startOz(s);
        System.out.println(answer);//TAKE ANSWER AS STRING
        sc.close();//CLOSE IS REQUIRED BECAUSE WARNING INDICATE
    }

    public static String startOz(String a)
        {   
            String ans = "";
            if(a.charAt(0)=='o')
            ans=ans+'o';

            if(a.charAt(1)=='z')
            ans=ans+'z';

        return ans;
        }
    
}

