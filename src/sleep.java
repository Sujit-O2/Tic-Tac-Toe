public class sleep extends Thread {
    public static void main(String[] args) throws Exception{
        
        String s=new String("i love my india \n i am sujit swain i love too be your boyfriend");
        for(int a=0;a<s.length();a++){
            System.out.print(s.charAt(a));
            sleep(100);
        }
    }
}
