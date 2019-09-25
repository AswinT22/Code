package Daily.DailyCodingProblem;


import java.util.function.BiFunction;
import java.util.function.Function;

class App{


    public static <T,U,R > Function<BiFunction<T,U,R>,R> cons(T a, U b){

        Function<BiFunction<T,U,R>,R> pair=f->f.apply(a,b);

        return  pair;


    }

    public static <T,U> T  car ( Function<BiFunction<T,U,T>,T> pair ) {



        return pair.apply((a,b)->a);

    }

    public static <T,U> U  cdr ( Function<BiFunction<T,U,U>,U> pair ) {



        return pair.apply((a,b)->b);

    }

        public static void main(String[] args) {

        System.out.println(car(cons(3,4)));
            System.out.println(cdr(cons(3,4)));

    }



}