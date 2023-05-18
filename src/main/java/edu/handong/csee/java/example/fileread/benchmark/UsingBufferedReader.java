package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide a file name as an argument.");
            return;
        }

        String fileName = args[0];

        StopWatch.start();

        BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
        while (inputStream.read() != -1) {
            // Reading the file
        }

        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");

        inputStream.close();
    }
}


        /*
        //-------------- Test reading 100 MB file. --------------------

        StopWatch.start();

        BufferedReader inputStream3= new BufferedReader(new FileReader(DumpDataWriter.input100MB));
        while (inputStream3.read()!=-1){}

        long duration3 = StopWatch.stop();
        System.out.println(duration3 + " milsec");
        
        inputStream3.close();


        //-------------- Test reading 1000 MB file. --------------------


        StopWatch.start();

        BufferedReader inputStream4= new BufferedReader(new FileReader(DumpDataWriter.input1000MB));
        while (inputStream4.read()!=-1){}

        long duration4 = StopWatch.stop();
        System.out.println(duration4 + " milsec");
        
        inputStream4.close();
        */
    }
}
