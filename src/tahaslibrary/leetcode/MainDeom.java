package tahaslibrary.leetcode;


import java.util.ArrayList;
import java.util.List;

public class MainDeom {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        //list.stream().filter(i -> ((i % 3) == 0) && ((i % 5) == 0) ? list.add("FizzBuzz"): ((i % 3) == 0) ? list.add("Fizz");:((i % 5) == 0) ? list.add("Buzz");: list.add(""+ i);).toList();
        /*
        for(int i = 1; i <= n; i++){
            if(((i % 3) == 0) && ((i % 5) == 0)){
                list.add("FizzBuzz");
            }else if ((i % 3) == 0) {
                list.add("Fizz");
            }else if ((i % 5) == 0){
                list.add("Buzz");
            }else {
                list.add(""+ i);
            }
        }*/
        return list;
    }

    public static void main(String[] args) {

    }
}
