package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("D:\\Scaler\\Backend\\scaler-project\\file3.txt");
        BufferedReader br=new BufferedReader(new FileReader("D:\\Scaler\\Backend\\scaler-project\\file1.txt"));
        ArrayList<Integer> list1=new ArrayList<>();
        String line=br.readLine();
        while(line != null){
            list1.add(Integer.valueOf(line));
            line=br.readLine();
        }
        Collections.sort(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        BufferedReader br1=new BufferedReader(new FileReader("D:\\Scaler\\Backend\\scaler-project\\file2.txt"));
        String line1=br1.readLine();
        while (line1 != null){
            list2.add(Integer.valueOf(line1));
            line1= br1.readLine();
        }
        Collections.sort(list2);
       // System.out.println("list1: "+ list1);
        //System.out.println("list2: "+list2);

        int id1=0,id2=0;
        while (id1 < list1.size() && id2 < list2.size()){
            if(list1.get(id1) < list2.get(id2)  ){
                pw.println(list1.get(id1));
                id1++;
            }
            else{
                pw.println(list2.get(id2));
                id2++;
            }
        }
        while(id1 < list1.size()){
            pw.println(list1.get(id1));
            id1++;
        }
        while (id2 < list2.size()){
            pw.println(list2.get(id2));
            id2++;
        }
        pw.flush();
        br.close();
        br1.close();
        System.out.println("Merged 2 files");
}
}