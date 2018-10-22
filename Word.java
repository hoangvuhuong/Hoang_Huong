/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictinariess;

/**
 *
 * @author Hoang Vu Huong
 */
public class Word {

    static void add(Word word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String word_target;// tu moi
    private String word_explain;// giai nghia

    public Word() {
        word_target = "";
        word_explain = "";
    }

    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public String ToString() {
        return word_target + "\t" + word_explain;
    }

}
