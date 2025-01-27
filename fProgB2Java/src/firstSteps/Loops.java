package firstSteps;

public class Loops {
    public static void main(String[] args) {
        //I KNOW, IT LOOKS HORRIBLE, BUT HEAR ME OUT
        //you declare a starting variable right on the start of the thing. then you create a condition for it to stop. finally, you tell how the program should increment (i++ for one by one)
        //for (i; until 10; one by one)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //while has a simplier sintax. works as expected, but more dangerous
        int cont = 10;
        while (cont < 20) {
            System.out.println(cont);
            cont++;
        }
    }
}
