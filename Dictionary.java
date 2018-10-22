/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictinariess;

import java.util.ArrayList;

/**
 *
 * @author Hoang Vu Huong
 */
public class Dictionary {

    static ArrayList<Word> WORD = new ArrayList<>();
//    static int size = WORD.size();
    
    public void insert() {
//        WORD.add(new Word("hello", "Xin Chào"));
//        WORD.add(new Word("goodbye", "Tạm Biệt"));
//        WORD.add(new Word("mother", "Mẹ"));
//        WORD.add(new Word("class", "Lớp"));
//        WORD.add(new Word("computer", "Máy tính"));
//        WORD.add(new Word("name", "Tên"));
//        WORD.add(new Word("teacher", "Giáo viên"));
//        WORD.add(new Word("add", "Thêm"));
//        WORD.add(new Word("bag", "Cặp"));
//        WORD.add(new Word("father", "Bố, ba, cha"));
//        WORD.add(new Word("sister", "Chị gái, em gái"));
//        WORD.add(new Word("brother", "Anh trai, em trai"));
//        WORD.add(new Word("web", "Lưới"));
//        WORD.add(new Word("chair", "Ghế"));
//        WORD.add(new Word("key", "khoá"));
//        WORD.add(new Word("table", "Bảng"));
//        WORD.add(new Word("time", "Thời gian"));
//        WORD.add(new Word("Character", "Kí tự"));
//        WORD.add(new Word("cup", "Cái ly")); 
//        WORD.add(new Word("clock", "Đồng hồ"));
//        WORD.add(new Word("line", "Dòng"));
//        WORD.add(new Word("bear", "Con Gấu"));
//        WORD.add(new Word("dog", "Con chó"));
//        WORD.add(new Word("cat", "Con mèo"));
//        WORD.add(new Word("animal", "Động vật"));
//        WORD.add(new Word("one", "số một"));
//        WORD.add(new Word("two", "số hai"));
//        WORD.add(new Word("three", "số ba"));
//        WORD.add(new Word("four", "số bốn"));
//        WORD.add(new Word("five", "số năm"));
//        WORD.add(new Word("six", "số sáu"));
//        WORD.add(new Word("seven", "số bảy"));
//        WORD.add(new Word("eight", "số tám"));
//        WORD.add(new Word("nine", "số chín"));
//        WORD.add(new Word("ten", "số mười"));
//        WORD.add(new Word("spring", "Mùa xuân"));
//        WORD.add(new Word("summer", "Mùa hè"));
//        WORD.add(new Word("winter", "Mùa đông"));
//        WORD.add(new Word("mouse", "con chuột"));
//        WORD.add(new Word("duck", "con vịt"));
//        WORD.add(new Word("messeger", "Tin nhắn"));
//        WORD.add(new Word("run", "Chạy"));
//        WORD.add(new Word("test", "kiểm tra"));
        new DictionaryManagement().InsertFromFile("dictionaries.txt");
    }


}
