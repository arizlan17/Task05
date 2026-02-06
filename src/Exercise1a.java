public class Exercise1a {
    public static void main(String[] args) {
        int x =1;
        while (x <10){
            x +=1;
            if (x > 3){
                System.out.println("Big x");
            }
//            else{
//                System.out.println("Small X");
//            }
        }
    }
}
//This will compille but this will print infinitely to prevent we should have a limit to it
//and if we need to prinnt Big X the X should be less than 10 and Graterthan 3