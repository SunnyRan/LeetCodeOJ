package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-07-30 16:51
 **/
public class StreamTest {

    public static int round = 1000;
    public ExecutorService executor = Executors.newFixedThreadPool(1000);
    List<Future<Integer>> futures = new ArrayList<>();
    List re = new ArrayList();
    List<Integer> test = new ArrayList();

    public static void main(String[] args) {
        StreamTest test = new StreamTest();
        test.getTestList();

        Long start =System.currentTimeMillis();

//        test.testFuture();
//        test.testStream();
       test.testParallelStream();
        Long end = System.currentTimeMillis();
        System.out.println("spend time :"+ ( end - start));
    }




    public void testFuture(){
        for (int i=0; i<test.size(); i++ ){
            int finalI = i;
            Callable<Integer> callable = ()-> this.doSomething(test.get(finalI));
            Future<Integer> future = executor.submit(callable);
            futures.add(future);
        }

        for (Future<Integer> future:futures){
            try {
                Integer segmentRs = future.get();
                re.add(segmentRs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
            }
        }
//        System.out.println(re);
        executor.shutdown();
    }

    public void testStream(){
        test.stream().forEach(info->re.add(doSomething(info)));
//        System.out.println(re);
    }

    public void testParallelStream(){
        test.parallelStream().forEach(info->re.add(doSomething(info)));
//        System.out.println(re);
    }





    public void getTestList(){
        for(int i = 0;i<round;i++){
            test.add(i+10);
        }
    }

    public Integer doSomething (Integer i){
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Random().nextInt(i);
    }
}
