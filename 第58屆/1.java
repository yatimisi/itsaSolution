import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String[] strArray=new String[]{"`","1","2","3","4","5","6","7","8","9","0","-","=","q","w","e","r","t","y","u","i","o","p","[","]","\\","a","s","d","f","g","h","j","k","l",";","'","z","x","c","v","b","n","m",",",".","/"};
        int num=cin.nextInt();
        cin.nextLine();
        for(int kk=0;kk<num;kk++){
            String n1=cin.nextLine();
            n1=n1.toLowerCase();
            String[] n2=n1.split("");
            for(String n3:n2){
                    if(n3.equals(" ")){
                            System.out.print(" ");
                    }else{
                            int tmp=0;
                            for(int i=0;i<strArray.length;i++){
                                    if(n3.equals(strArray[i])){
                                            tmp=i+1;
                                            break;
                                    }
                            }
                            if(tmp<0)
                                    tmp+=strArray.length;

                            System.out.print(strArray[tmp]);
                    }
            }
            System.out.println();
        }
        
        
        
        
        

    }
};