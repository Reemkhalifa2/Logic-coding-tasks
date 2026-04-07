public class fizzString2 {
    public String fizzString2(Integer n){
        if (n%5==0 && n%3==0){
            return "FizzBuzz!";
        }
        else if (n%5==0){
            return "Buzz!";
        }

        else if (n%3==0){
            return "Fizz!";
        }else{
            return n + "!";
        }


    }

}
