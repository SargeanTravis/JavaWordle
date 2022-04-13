package com.company;

import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;



//Way to limit user from entering more than one chracter into a wordle box
//Found this on StackOverflow https://stackoverflow.com/questions/3519151/how-to-limit-the-number-of-characters-in-jtextfield
public class JTextFieldLimit extends PlainDocument {
    private int limit;

    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
        if (str == null) return;

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}