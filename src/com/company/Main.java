package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	int niz[] = new int[]{11, 12, 41, 12, 243, 42, 123 };

	niz = Arrays.stream(niz).
            boxed().
            sorted((x, y) -> suma(x) - suma(y)).
            mapToInt(i -> i).
            toArray();
    }

    private static int suma(int x){
        int suma = 0;
        while(x > 0){
            suma +=  x % 10;
            x /= 10;
        }
        return suma;
    }
}
