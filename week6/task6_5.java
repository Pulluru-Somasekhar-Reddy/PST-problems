import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(mars(s));
    }
    public static int mars(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i%3==0||i%3==2){
                if(s.charAt(i)!='S'){
                    count++;
                }
            }
            else if(i%3==1&&s.charAt(i)!='O'){
                count++;
            }
        }
        return count;
    }
}
