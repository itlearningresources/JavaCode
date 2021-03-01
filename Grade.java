import  java.util.*;

public class Grade {
    private int numGrade;
    private char letterGrade;

    public Grade(int g) {
        numGrade = g;
        letterGrade = (numGrade >= 65) ? 'S' : 'U';
    }
    
    public int getNumGrade() {
        return numGrade;
    }
    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char l) {
        letterGrade = l;
    }
    
    public String toString() {
        String szRet = "";
        szRet="Score " + this.getNumGrade() + ", " + "Letter Grade " + this.getLetterGrade();
        return szRet;
    }
    
    public boolean isSatisfactory() {
        boolean bRet = false;
        if (letterGrade == 'S') bRet = true;
        return bRet;
    }

    public boolean equals(Grade other) {
        boolean bRet = false;
        if (this.getLetterGrade() == other.getLetterGrade()) bRet = true;
        return bRet;
    }
    
}
