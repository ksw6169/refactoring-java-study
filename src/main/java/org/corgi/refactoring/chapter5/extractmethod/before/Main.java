package org.corgi.refactoring.chapter5.extractmethod.before;

public class Main {

    public static void main(String[] args) {

        Banner hello = new Banner("Hello, World!");
        hello.print(3);
    }
}