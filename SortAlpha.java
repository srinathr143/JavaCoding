public class SortAlpha {
    public static void main(String[] args){
        String s = "srinath";
        System.out.println(alphaSort(s));
    }
    private static String alphaSort(String s){
        int[] count = new int[256];

        for(char c: s.toCharArray()){
            count[c]++;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<256;i++){
            while(count[i]>0){
                result.append((char)i);
                count[i]--;
            }
        }
        return result.toString();
    }
}
