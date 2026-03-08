
public class ExtractNumAndSUm {
    public static void main(String[] args){
        String s = "@data#2000--334::3";
        System.out.println(numSum(s));
    }
    private static int numSum(String s){
        String str = s.replaceAll("[^0-9]"," ");
        //System.out.println(str);
        String[] clean = str.trim().split("\\s+");
        //System.out.println(Arrays.toString(clean));
        int sum =0;
        for(String c: clean){
            if(!c.isEmpty()) {
                sum += Integer.parseInt(c);
            }
        }
        return sum;
    }
}
