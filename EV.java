import  java.util.*;

public class EV {
    private int range;
    private String model;

    public EV(int r, String m) {
        range = r;
        model = m;
    }
    
    public int getRange() {
        return range;
    }
    public String getModel() {
        return model;
    }

    public void setRange(int r) {
        range = r;
    }
    
    public String toString() {
        return "Range " + this.getRange() + ", " + "Model " + this.getModel();
    }
    
    public int compareTo(EV other) {
        int nRet = -1;
        if (this.range >   other.range) nRet = 1;
        if (this.range ==  other.range) nRet = 0;
        return nRet;
    }
    public boolean samemodel(EV other) {
        boolean bRet = false;
        String model1 = this.getModel();
        String model2 = other.getModel();
        if (model1.equals(model2)) bRet = true;
        return bRet;
    }
}
