public class inOrder {
    public Boolean inOrder(Integer a, Integer b, Integer c, Boolean bOk){
        if(bOk){
            return c>b;
        }else {
            return b>a && c>b;
        }

    }

}
