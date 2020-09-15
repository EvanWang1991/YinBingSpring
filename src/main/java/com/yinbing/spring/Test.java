package com.yinbing.spring;

import java.util.concurrent.CountDownLatch;

public class Test {
    private static int result = 0;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch count = new CountDownLatch(3);
        for (int i = 0; i < 100; i++) {

            new Thread(() -> {
                count.countDown();
                addAll2();
            }).start();
        }

        for (int i = 0; i < 100; i++) {

            new Thread(() -> {
                count.countDown();
                addAll1();
            }).start();
        }
        System.out.println("开始执行");
        count.await();
    }


    public static void addAll1(){
        long start  = System.currentTimeMillis();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            result += i;
        }
        long end  = System.currentTimeMillis();
        System.out.println("1----耗时：" + (end -start));
    }

    public static void addAll2(){
        long start  = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end  = System.currentTimeMillis();
        System.out.println("2----耗时：" + (end -start));
    }
}
