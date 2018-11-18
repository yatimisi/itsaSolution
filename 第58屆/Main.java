import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int num=cin.nextInt();
        for(int i=0;i<num;i++){
            int P=cin.nextInt();
            int A=cin.nextInt();
            int B=cin.nextInt();
            int[][] Path=new int[2][0];
            int tmp=cin.nextInt(),tmp2;
            while(tmp!=-1){
                tmp2=cin.nextInt();
                Path=tmpAdd(Path,tmp,tmp2);
                Path=tmpAdd(Path,tmp2,tmp);
                tmp=cin.nextInt();
            }
            /*for(int j=0;j<Path.length;j++){
                for(int k=0;k<Path[j].length;k++){
                    System.out.println("Path["+j+"]["+k+"]="+Path[j][k]);
                }  
            }*/
            boolean[] PP=new boolean[P];
            boolean[] QQ=new boolean[Path[0].length];
            if(tmpInput(Path,A,B,false,P,PP,QQ))
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
    static boolean tmpInput(int[][] Path,int A,int B,boolean tmp,int P,boolean[] PP,boolean[] QQ){
        if(tmp)
            System.out.println("tmpInput("+","+A+","+B+",true,"+P+")");
        else
            System.out.println("tmpInput("+","+A+","+B+",false,"+P+")");
        boolean tmps=tmp;
        if(!tmps){
            for(int i=0;i<Path[0].length;i++){
                if(A==Path[0][i]&&(!QQ[i])){
                    if(B==Path[1][i]){
                        QQ[i]=true;
                        for(int kk=0;kk<PP.length;kk++){
                            if(PP[kk]&&kk==PP.length-1){
                                P--;
                            }
                        }
                        
                        if(P!=0)
                            tmps=tmpInput(Path,Path[1][i],B,tmps,P,PP,QQ);
                        else
                            tmps=true;
                    }else
                        tmps=tmpInput(Path,Path[1][i],B,tmps,P,PP,QQ);
                }                    
            }
        }
        return tmps;
    }
    static int[][] tmpAdd(int[][] Path,int tmp,int tmp2){
        int[][] tmpPath=new int[2][Path[0].length+1];
        
        for(int k=0;k<Path[0].length;k++){
            tmpPath[0][k]=Path[0][k];
            tmpPath[1][k]=Path[1][k];
        }
        
        tmpPath[0][Path[0].length]=tmp;
        tmpPath[1][Path[1].length]=tmp2;
            
        return tmpPath;
    }
};