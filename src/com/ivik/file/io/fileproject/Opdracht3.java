package com.ivik.file.io.fileproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian on 7-2-2016.
 * Met hulp van Rudger :-D
 */

public class Opdracht3 {

        private static File inputFile = new File("Opdracht3.txt");
        private static File outputFile = new File("TargetOpd3.txt");
        private static List list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

                    while((line = br.readLine()) != null)  {
                    String[] data = line.split("\\s");

                    for (String s : data)   {
                        list.add(Double.parseDouble(s));
                         }

                        sortList();

                    for (Object num : list) {
                        bw.write(num.toString()+" ");
                        }

                        bw.write("\n");
                        list.clear();

                    }
                        br.close();
                        bw.flush();
                        bw.close();

        System.out.println("Zie TargetOpd3.txt voor de gesorteerde nummers.");
    }

    private static void sortList() {
        boolean isSorted = false;
            Object temp;
            while (!isSorted) {
                isSorted = true;
                for (int i=0; i < list.size()-1; i++) {
                    int swap = compare(list.get(i), list.get(i+1));
                    if (swap == 0) {
                        continue;
                    } else if(swap == -1) {
                        temp = list.get(i);
                        list.set(i, list.get(i+1));
                        list.set(i+1, temp);
                        isSorted = false;
                    }
                }
            }
        }

        private static int compare(Object n1, Object n2) {
            Double d1 = (Double) n1;
            Double d2 = (Double) n2;
            if (d1.doubleValue() == d2.doubleValue()) return 0;
            if (d1.doubleValue() > d2.doubleValue()) return -1;
            return 1;
        }
}
