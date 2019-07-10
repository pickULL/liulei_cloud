package com.liulei.cloud.liuleispringcloudfeigh;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new LinkedList();
        List list2 = new Vector();

        Map map = new HashMap();



        String s = "aa";
        int i = s.hashCode();
        new Thread01().start();
        new Thread02().start();
    }
}

class Thread01 extends Thread{
    private String s;
    public Thread01(){}

    public Thread01(String s){
        this.s = s;
    }
    @Override
    public void run() {
        synchronized (Test.class) {
            int count = 0;
            for(int i=1;i<=52;){
                if(count<2){
                    count++;
                    System.out.print(i);
                    i++;
                    Test.class.notifyAll();
                }else {
                    count = 0;
                    try {
                        Test.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

    }
}
class Thread02 extends Thread{

    private String s;
    public Thread02(){}
    public Thread02(String s){
        this.s = s;
    }
    @Override
    public void run() {
        synchronized (Test.class) {
            char i='A';
            while (i<='Z'){
                System.out.print(i);
                i++;
                try {
                    Test.class.notifyAll();
                    Test.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}