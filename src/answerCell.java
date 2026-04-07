public class answerCell {
    public Boolean answerCell(Boolean isMorning, Boolean isMom, Boolean isAsleep){
        if(isAsleep){
            return false;
        }
        else if(isMorning ){
            return isMom ? true:false ;
        }else{
            return true;
        }
    }
}
