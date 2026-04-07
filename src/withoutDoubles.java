public class withoutDoubles {
    public Integer withoutDoubles(Integer die1, Integer die2, Boolean noDoubles){
        Integer result =0;
        if (!noDoubles) {
            result= die1 + die2;

        } else if (die1 != die2) {
            result= die1 + die2;

        } else if (die1 == die2) {

            if (die1 < 6) {
                die1++;
            }else {
                die1 =1;
            }

            result= die1 + die2;
        }
        return result;
    }
}