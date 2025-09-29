package firstSteps;

public class Vectors {
    public static void main(String[] args) {
        //Vectors are like a list of variables. they are a way to store multiple values
        //you delcare them similarly to a variable, but with some specificy
        int[] vector = {1, 2, 3, 4, 5};
        //the whole [] deal work just like portugol, so you know the deal. its like an address. remember tho: starts on 0
        System.out.println(vector[0]);
        //no need to declare vector size. just do it. to see the size, use .length
        System.out.println(vector.length);
        //BUT it is possible to create a new empty vector
        int[] nullVector = new int[5];
        System.out.println("vector value at 0: " + nullVector[0]);
        System.out.println("vector value at 1: " + nullVector[1]);
        System.out.println("vector value at 2: " + nullVector[2]);
        System.out.println("vector length: " + nullVector.length);
    }
}
