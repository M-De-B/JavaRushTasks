package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

private SomeInterfaceWithMethods original;

    public CustomInvocationHandler(SomeInterfaceWithMethods original) {
        this.original = original;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(method.getName()+" in");
        Object o1 = method.invoke(original);
        System.out.println(method.getName()+" out");

        return o1;
    }
}
