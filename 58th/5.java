import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int num=cin.nextInt();
        for(int i=0;i<num;i++){
            int count=cin.nextInt();
            int[] ss=new int[count];
            for(int j=0;j<count;j++)
                ss[j]=cin.nextInt();
            
            int ans=0;
            Arrays.sort(ss);
            for(int j=0;j<ss.length;j++)
                for(int k=0;k<=j-1;k++)
                    ans+=ss[k];
                
                   
            System.out.println(ans);
        }
    }
};