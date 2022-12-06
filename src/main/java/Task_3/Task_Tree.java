package Task_3;

import java.util.HashMap;

public class Task_Tree {
    public static void main(String[] args) {
        Integer[] factors1 = {-5, 8, 9, 1};
        Integer[] factors2 = {10, 3, 1, 8, 8, 9};
        HashMap<String,Integer> poly1 = Polynomials.createPolynomial(factors1);
        System.out.println("Polynomial 1: "+poly1);
        HashMap<String,Integer> poly2 = Polynomials.createPolynomial(factors2);
        System.out.println("Polynomial 2: "+poly2);
        HashMap<String,Integer> poly3 = Polynomials.polynomialAddition(poly1,poly2);
        System.out.println("After addition : "+poly3);

    }


}
class Polynomials {

    public static HashMap<String,Integer> createPolynomial(Integer[] factors) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < factors.length; i++) {
            map.put("x"+(factors.length-i),factors[i]);
        }
        return map;
    }
    public static HashMap<String,Integer> polynomialAddition(HashMap<String,Integer> poly_1,HashMap<String,Integer> poly_2){
        poly_1.forEach((k,v)->poly_2.merge(k,v, Integer::sum));
        return poly_2;
    }

}