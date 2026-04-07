public class squirrelPlay {
    public Boolean squirrelPlay(Integer temp, Boolean isSummer){
        if(isSummer){
            return temp>=60 && temp <= 100;
        }else{
            return temp>=60 && temp <= 90;
        }
    }
}
