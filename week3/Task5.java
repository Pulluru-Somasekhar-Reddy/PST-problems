import java.math.BigInteger;
class Task5{
    public String addNumberStrings(String input1, String input2){
        BigInteger a=new BigInteger(input1);
        BigInteger b=new BigInteger(input2);
        BigInteger c=a.add(b);
        return c.toString();   
    }
    public static void main(String[] args) {
        Task5 t = new Task5();
        System.out.println(t.addNumberStrings("123", "456"));
        }
}