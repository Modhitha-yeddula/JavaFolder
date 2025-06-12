
package com.vogella.eclipse.ide.java8;public class Java8Example{
    public static void main(String[] agrs){
        Runnable runnable=new Runnable(){
            public void run(){
                System.out.println("hello lambdas");
            }
        };
        new Thread(runnable);
    }
}