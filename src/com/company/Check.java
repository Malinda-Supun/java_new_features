package com.company;

public class Check {

    @FunctionalInterface
    interface Greeting{
        public String sayHello(String a);
    }

    public void testGreeting(String name, Greeting g){
        System.out.println("Result :" + g.sayHello(name));
    }

    public static void main(String[] args) {

        new Check().testGreeting("Kamal", (name) -> "Hello "+ name);
        new Check().testGreeting("Achala", (name) -> "Hello "+ name);

        new Check().testGreeting("", (name) -> {
            return !    name.isEmpty() ? "Hello "+ name : "You fogot something ?";
        });

    }
}
