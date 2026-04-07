public class in1To10 {
    public Boolean in1To10(Integer n, Boolean outsideMode){
        if(outsideMode){
            return (n<=1 || n>=10);
        }else{
            return (n>=1 && n<=10);
        }
    }
}
