import java.util.*;
public class BeautifulBinaryStrings {

    static int minSteps(int n, String str){
        // Complete this function
      if(n<=2) return 0;
      int i,ans=0;
      char first=str.charAt(0),second=str.charAt(1),third;
      for(i=2;i<n;i++){
        third=str.charAt(i);
        if(first=='0' && second=='1' && third=='0')
        {
          third=(third=='0'?'1':'0');
          ans++;
        }
        first=second;
        second=third;
      }
      return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        int result = minSteps(n, str);
        System.out.println(result);
    }
}