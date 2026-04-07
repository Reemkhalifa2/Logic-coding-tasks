public class lessBy10 {
    public Boolean lessBy10(Integer a, Integer b, Integer c){
        return ( Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10);
    }
}
