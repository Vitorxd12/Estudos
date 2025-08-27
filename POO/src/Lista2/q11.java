package Lista2;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
//1. Implemente um m´etodo gen´erico mapear(T valor, Function<T, R> func) e use-o para:
//• Calcular o quadrado de um n´umero inteiro.
//• Converter um texto em letras min´usculas.
//*
public class q11{
    //public static void mapear(T valor, Function<T, R> func){
        //System.out.println(func.apply(valor));
    //}
    public static void main(String[] args) {
        Function<Integer, Integer> quadrado = (a) -> a*a;
        //mapear(4, quadrado);
    }
}
