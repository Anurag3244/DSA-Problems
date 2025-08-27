package Patterns_Part_1;

public class star_pattern {
    public static void main(String[] args) {


//     print star pattern
//    *
//    * *
//    * * *
//    * * * *
    for (int line = 0; line <=4; line++){
            for(int star =1; star<=line; star++){
                System.out.print("* ");
            }
        System.out.println();
        }

    }
}
