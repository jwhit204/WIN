package com.tts.io;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws IOException {

//        FileInputStream in = null;
        FileReader in = null;
//        FileOutputStream out = null;
        FileWriter out = null;

        try {

//            in  = new FileInputStream("input.txt");
            in  = new FileReader("input.txt");
//            out = new FileOutputStream("output.txt");
            out = new FileWriter("output.txt");


            int c;
            while ((c = in.read()) != -1) {
    out.write(c);
            }
        } finally {

            if (in != null) {
                out.close();
            }
        }


    }
}
