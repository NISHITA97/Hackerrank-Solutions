import java.io.*;
import java.util.*;

public class ClosestNumbers {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int i,n=sc.nextInt(),arr[];
      arr=new int[n];
      for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
      int diff,min=Integer.MAX_VALUE;
      ArrayList<Integer> ans=new ArrayList<>();
      for(i=0;i<n-1;i++){
        diff=Math.abs(arr[i+1]-arr[i]);
        if(diff<=min){
          min=diff;
          if(!hm.containsKey(diff)){
            ans=new ArrayList<>();
            ans.add(i);
            hm.put(diff,ans);
          }
          else{
            ans=hm.get(diff);
            ans.add(i);
            hm.put(diff,ans);
          }
       }
      }
      ans=hm.get(min);
      for(int j:ans){
        System.out.print(arr[j]+" "+ arr[j+1]+" ");
      }
      sc.close();
    }
}