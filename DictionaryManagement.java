/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictinariess;

import static dictinariess.Dictionary.WORD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hoang Vu Huong
 */
public class DictionaryManagement {

    public void InsertFromFile(String ten_file) {
        String S;
        try {
            File f = new File(ten_file);
            try (BufferedReader file = new BufferedReader(new FileReader(f))) {
                if (!file.ready()) {
                    throw new IOException();
                }
                while ((S = file.readLine()) != null) {
                    String s1 = S;
                    if (!s1.contains("\t")) {
                        continue;
                    }
                    String[] a = s1.split("\t");
                    String word_target = a[0];
                    String word_explain = a[1];
                    WORD.add(new Word(word_target, word_explain));
                }
                file.close();
            }
        } catch (IOException e) {
            System.err.println("Loi     " + Arrays.toString(e.getStackTrace()));
        }
    }

    public void dictionaryExportToFile(String ten_file) {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ten_file), "UTF-8"));
            for (Word ele : Dictionary.WORD) {
                output.write(ele.ToString());
                output.newLine();
            }
            output.close();
        } catch (Exception e) {
            System.err.println("Loi:" + e.getMessage());
        }

    }

    public void insertFromCommandline() {

        int count;
        try (Scanner scan = new Scanner(System.in)) {
            count = scan.nextInt();
            for (int i = 0; i < count; i++) {
                String word_target;
                String word_explain;
                word_target = scan.nextLine();
                word_explain = scan.nextLine();
                WORD.add(new Word(word_target, word_explain));
            }
            scan.close();
        } catch (Exception e) {
            System.err.println("Loi: " + e.getMessage());
        }
    }

    public void dictionaryLookup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Từ bạn muốn tra cứu là : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        for (Word ele : Dictionary.WORD) {
            if (ele.getWord_target().equals(s)) {
                System.out.println(ele.getWord_target() + "\nNghĩa: " + ele.getWord_explain());
            }
        }
    }

    public void AddWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap Tu Ban Muon Them");
        String word_target = scan.nextLine();
        System.out.println("Nhap Nghia Cua Tu Ban Muon Them");
        String word_explain = scan.nextLine();
        WORD.add(new Word(word_target, word_explain));
    }

    public void Remove() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap tu ban muon xoa: ");
        String s = scan.nextLine();
        int in = 0;
        for (Word ele : WORD) {
            if (ele.getWord_target().equals(s)) {
                WORD.remove(in);
                break;
            }
            in++;
        }
    }

    public void Changer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Tu Muon Sua: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean check = false;
        for (Word ele : Dictionary.WORD) {
            if (ele.getWord_target().equals(s)) {
                check = true;
                String s1;
                System.out.println("Nhập Từ Mới: ");
                s1 = sc.nextLine();
                ele.setWord_target(s1);
                System.out.println("Nhập nghĩa mới: ");
                s1 = sc.nextLine();
                ele.setWord_explain(s1);
                break;
            }

        }
        if (check == false) {
            System.out.println("Không tìm thấy từ : " + s);
        }
    }
}
