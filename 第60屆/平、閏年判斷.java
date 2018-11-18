import java.util.Scanner;
public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
	int nn= sc.nextInt();
	for(int i=0;i<nn;i++){
      	 int sec = sc.nextInt();
        if(sec%400==0)
            System.out.println("Bissextile Year");
        else if(sec%4==0 && sec%100!=0)
            System.out.println("Bissextile Year");
        else
            System.out.println("Common Year");
}

    }
}