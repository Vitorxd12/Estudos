package Aula_0_Preparatorio;
//when we create a java file, we need to create a class with the same nas as the file.
//every jva file is hard writen with its class, but it is also possible to create another class in between them
//those classes on witch the name of the file is based on are called public, and it can only be one public class par file. that's we name it: "public class HelloWorld {}"

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hi there! lets declare some variables");
        System.out.println("first you say the format, then its name, and its value");
        int age = 20;
        String name = "John Doe";
        System.out.println(age);
        //thing is: you cant change variables format midway. once integer, always integer.
        //if you want to edit this variable, dont you worry about declaring its format. it has alrealdy been done

        age = age + 1;
        System.out.println(age);
    }
}
