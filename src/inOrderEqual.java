public class inOrderEqual {
    public Boolean inOrderEqual(Integer a, Integer b, Integer c, Boolean equalOk){
        if(equalOk){
            return  a <= b && b <= c;
        }else {
            return a < b && b < c;
        }
    }

}
