public class cigarParty {
    public Boolean cigarParty(Integer cigars, Boolean isWeekend){
        if (isWeekend){
            return cigars >= 40;
        }else{
            return cigars >= 40 && cigars<=60;
        }
    }
}
