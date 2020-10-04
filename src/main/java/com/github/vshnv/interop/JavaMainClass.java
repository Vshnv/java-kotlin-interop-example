package com.github.vshnv.interop;

public class JavaMainClass {
    public static void main(String[] args) {
        //java - java usage
        JHuman javaHuman = new JHuman("JavaUser", 22);
        System.out.println(javaHuman.getName() + "--" + javaHuman.getAge());
        //java - kotlin usage
        KHuman kotlinHuman = new KHuman("Kotliner", 15);
        System.out.println(kotlinHuman.getName() + "--" + kotlinHuman.getAge());

        javaHuman.sayHi();
        kotlinHuman.sayHi();
    }
}
