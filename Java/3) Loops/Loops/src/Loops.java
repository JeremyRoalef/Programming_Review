public class Loops {
    public static void main(String[] args){

        //While Loop
        int x = 1;
        while (true){
            if (x == 5 || x == 8){
                ++x; //prefix increment (Add 1 to the value of x, then use it where it was called)
                continue; //dont run any more code in the loop and continue to the next loop
            }
            System.out.printf("Loop #%d%n", x++); //x++ is a postfix increment
                                                  // (Use current value of x, then add 1)
            if (x > 10){
                break; //exit the loop
            }
        }

        System.out.println();

        //Do-While Loop
        int y = 1;
        do{
            System.out.printf("Loop #%d%n", y);
        }while(y < 1);

        System.out.println();

        //For Loop
        //for (initializer; condition; increment){}
        for (int z = 0; z < 10; z++){
            System.out.printf("Loop #%d%n", z);
        }
    }
}