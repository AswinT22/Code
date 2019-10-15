
//Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.


package Daily.DailyCodingProblem;

import java.util.concurrent.*;

class JobScheduler {


  private static ScheduledExecutorService executor;
   public static void main(String[] args){


    executor =   Executors.newSingleThreadScheduledExecutor();

    ScheduledFuture<?> future=   scheduleJob(()-> System.out.println("In the Schedular"),1000);



    executor.shutdown();
    executor=null;


   }

   static ScheduledFuture<?> scheduleJob(Runnable command, long delay_ms){

    return executor.schedule(command,delay_ms, TimeUnit.MILLISECONDS);
   }
}

//Reference
// https://dynalist.io/d/nFlLehsHNCwBBzHUVjx1TMST  ------------> ThreadFactory
// https://dynalist.io/d/_sUSLNp1trsbntXQ-2hwtBhD  ------------> Java ScheduledExecutorService
//https://dynalist.io/d/_kAA-AgdVasP4fGLNcmeQJgo   ------------> Java Callable and Future
//https://dynalist.io/d/P7pEWmWSwsdWNklgt9YHhQJ3   ------------> Future and FutureTask
//https://dynalist.io/d/j8CLlRTlX9a9UVJK94KI3kOY   ------------> Executor.execute vs Executor.submit  and RunnableFuture<V>,Interface ScheduledFuture<V>
