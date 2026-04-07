public class teaParty {
    public Integer teaParty(Integer tea, Integer candy){
        if(tea<5 || candy < 5){
            return 0;
        }
        else if(tea >= candy*2 || candy >= tea*2){
            return 2;
        }
        else {
            return  1;
        }

    }
}
