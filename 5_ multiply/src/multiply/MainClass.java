package multiply;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

        String str1;
        String str2;

        String answer;
        int numberOfLines = 2;
        String[] textData = new String[numberOfLines];

        // Create output
        File file_in = new File("D:\\input.txt");

        try {

            file_in.createNewFile();

            FileReader r1 = new FileReader(file_in);
            BufferedReader b1 = new BufferedReader(r1);

            for (int i = 0; i < numberOfLines; i++) {
                textData[i] = b1.readLine();
            }
            System.out.println("Number1 = " + textData[0]);
            System.out.println("Number2 = " + textData[1]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (textData[0] == null) {
            textData[0] = String.valueOf(0);
        } else if (textData[1] == null) {
            textData[1] = String.valueOf(0);
        }

        Mul m1 = new Mul();

        str1 = textData[0];
        str2 = textData[1];

        if ((str1.charAt(0) == '-' || str2.charAt(0) == '-')
                && (str1.charAt(0) != '-' || str2.charAt(0) != '-')) {
            System.out.print("-");
        }

        if (str1.charAt(0) == '-'
                && str2.charAt(0) != '-') {
            str1 = str1.substring(1);
        } else if (str1.charAt(0) != '-'
                && str2.charAt(0) == '-') {
            str2 = str2.substring(1);
        } else if (str1.charAt(0) == '-'
                && str2.charAt(0) == '-') {
            str1 = str1.substring(1);
            str2 = str2.substring(1);
        }
        System.out.println("\n\n   Multiply: Number1 * Number2 = " + m1.multiply(str1, str2));

        // Create output
        answer = m1.multiply(str1, str2);
        if (file_in.exists()) {
            try {
                File file_out = new File("D:\\output.txt");
                file_out.createNewFile();
                FileWriter w1 = new FileWriter(file_out, true);
                BufferedWriter b2 = new BufferedWriter(w1);
                if (textData[0].contains("-") || textData[1].contains("-")) {
                    b2.write('-');
                }
                b2.write(answer);
                b2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
