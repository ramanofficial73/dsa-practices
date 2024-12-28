package com.dsa.practices.dec2024.dec27.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonPattern {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        /* 1. Reflection (Breaking Singleton via Reflection) */
        breakSingletonUsingReflection();

        /* 2. Serialization (Breaking Singleton via Serialization) */
        breakSingletonUsingSerialization();

    }

    private static void breakSingletonUsingSerialization() throws IOException, ClassNotFoundException {
        /* 2. Serialization (Breaking Singleton via Serialization)
         * The Singleton class might break its pattern when it is serialized and then deserialized,
         * creating a new instance.
         * */

        /* Serialize the Singleton object */
        LazySingletonClass firstInstance = LazySingletonClass.getInstance();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(firstInstance);
        out.close();

        /* Deserialize the Singleton object (creates a new instance) */
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        LazySingletonClass secondInstance = (LazySingletonClass) in.readObject();
        in.close();

        System.out.println("Fist instance hasCode : " + firstInstance.hashCode());
        System.out.println("Second instance hasCode : " + secondInstance.hashCode());
    }

    private static void breakSingletonUsingReflection() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /* 1. Reflection (Breaking Singleton via Reflection)
         * Using reflection, it is possible to bypass the constructor's access control and
         * create multiple instances of a Singleton class.
         * */

        /* First instance using the getInstance method */
        LazySingletonClass lazySingletonClass = LazySingletonClass.getInstance();

        /*  Break Singleton using reflection */
        Constructor<LazySingletonClass> constructors = LazySingletonClass.class.getDeclaredConstructor();
        constructors.setAccessible(true);
        LazySingletonClass secondInstance = constructors.newInstance();
        System.out.println("Fist instance hasCode : " + lazySingletonClass.hashCode());
        System.out.println("Second instance hasCode : " + secondInstance.hashCode());
    }
}
