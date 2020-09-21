package com.innopolis;

import java.nio.file.Files;
import java.nio.file.Paths;

public class  MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            if (name.toLowerCase().contains("board")){
                final byte[] bytes = Files.readAllBytes(Paths.get("Board.java"));
                return defineClass(name, bytes, 0, bytes.length);
            } else {
                return null;
            }
        }catch (Exception e){

        }
        return super.findClass(name);
    }
}
