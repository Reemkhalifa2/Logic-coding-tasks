public class lastDigit {
    public Boolean lastDigit(Integer a, Integer b, Integer c){
        return (a % 10 == b % 10 || a % 10 == c % 10|| b % 10 == c % 10);
    }
}
