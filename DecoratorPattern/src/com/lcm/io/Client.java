package com.lcm.io;


import java.io.*;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 上午10:59
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args){

        try {
            FileInputStream fileInputStream = new FileInputStream("DecoratorPattern/test.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);

            byte[] bytes = new byte[dataInputStream.available()];
            dataInputStream.read(bytes);
            String content = new String(bytes);
            System.out.println(content);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
