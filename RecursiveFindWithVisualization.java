
public class RecursiveFindWithVisualization {

    public static void main(String[] args) {
       test('s',"fresh");
       test('k',"Freedom");
       test('5',"34521");
    }

    private static void test( char c, String sz) {
       System.out.println("\nTest Run:    Look for \'" +c+ "\' in \"" +sz+ "\"");
       Cells cells = new Cells();
       System.out.println("Test Complete: recursiveFind for \'" +c+ "\' in \"" +sz+ "\" returns: " + recursiveFind(c,sz,cells));
    }

    private static boolean recursiveFind(char c, String sz, Cells cells)  {

        // For Visualization ************************
        //Cell cell = new Cell("?",String.valueOf(c),sz);
        Cell cell = new Cell(new Tuple("rtrns","?"),new Tuple("c",String.valueOf(c)), new Tuple("sz",sz));
        cells.put(cell);
        cells.forward();
        System.out.println(cells);
        // *****************************************

        boolean bRet = false;

        if (sz.length() == 0)
            bRet = false;
        else
            if (sz.substring(0,1).equals(String.valueOf(c)))
                bRet = true;
            else
                bRet = recursiveFind(c, sz.substring(1), cells);

        // For Visualization ************************
        cell.setLastCellRow(bRet ? "rtrns true" : "rtrns false");
        cells.backward();
        System.out.println(cells);
        cells.drop();
        // *****************************************
            
        return bRet;
    }

}

// ********************************************************************************************************** 
// Supporting Classes
// ********************************************************************************************************** 
class Tuple {
   String prefix;
   String value;
   public Tuple (String prefix, String value) {
      this.prefix = prefix;
      this.value = value;
   }
   public String toString() {
       return String.format("%s = %s", prefix, value);
   }
} 

class Cell 
{
   static final int CELLHEIGHT = 4;
   static final int CELLWIDTH  = 15;
   private int cursor = 0;

   private String[] cell       = new String[CELLHEIGHT];
   private String[] cellprefix = new String[CELLHEIGHT];
   public Cell() {
       init();
   }
   public Cell(String last, String ... list) {
       init();
       for (String sz : list) this.put(sz);
       setLastCellRow(last); 

   }
   public Cell(String last, Tuple ... list) {
       init();
       for (Tuple t : list) this.put(t.toString());
       setLastCellRow(last); 

   }
   public Cell(Tuple last, Tuple ... list) {
       init();
       for (Tuple t : list) this.put(t.toString());
       setLastCellRow(last.toString()); 

   }
   public void setprefix(int n, String sz) {
       cellprefix[n] = sz;
   }
   public void clearprefix(int n) {
       cellprefix[n] =""; 
   }
   public void clear() {
       init();
   }
   public void init() {
       for (int i=0;i<CELLHEIGHT;i++) cellprefix[i] = ""; 
       for (int i=0;i<CELLHEIGHT;i++) cell[i] = StringUtilities.center("", CELLWIDTH);
       this.cursor = 0;
   }
   public int size() {
       return CELLHEIGHT;
   }
   public String getCellRow(int i) {
       return this.cell[i];
   }
   public void put(String sz) {
           if ( sz.length() > CELLWIDTH ) {
               System.out.println("Error: Input string too wide for the visualization cell");
               System.out.println("       Increase the size of Cell.CELLWIDTH");
               System.out.println("       Currently the value of Cell.CELLWIDTH is " + Cell.CELLWIDTH);
               System.out.println();
               System.exit(1);
           } else {
               setCellRow(sz);
           }
   }
   private void setCellRow(String sz) {
           this.cell[cursor] = StringUtilities.left(sz,CELLWIDTH);
           cursor++;
           cursor = (cursor == CELLHEIGHT) ? 0 : cursor;
   }
   public void setLastCellRow(String sz) {
           this.cell[CELLHEIGHT-1] = StringUtilities.left(sz,CELLWIDTH);
   }
   public String toString() {
       StringBuilder sb = new StringBuilder();
       String bar = StringUtilities.bar(CELLWIDTH);
       sb.append(bar).append(StringUtilities.NL);
       for (int i=0;i<this.CELLHEIGHT;i++) sb.append(this.cell[i]).append(StringUtilities.NL);
       sb.append(bar);
       return sb.toString();
   }
}

class Cells 
{
   private static final int MAXCELLS = 50;
   private static final int EMPTY = -1;
   private static final String SZBACKWARD   = " << ";
   private static final String SZFORWARD    = " >> ";

   private Cell[] cells = new Cell[MAXCELLS];
   private int cursor = EMPTY;
   private String szBetween    = " >> ";
   private String szBetweenBar = "    ";

   public Cells() {
       cursor = EMPTY;
       forward();
   }
   public Cells(Cell ... list) {
       cursor = EMPTY;
       forward();
       for (Cell c : list) {
           put(c);
       }
   }
   public void drop() {
      if (cursor >= 0) cursor--;
   }
   public void forward() {
      szBetween = SZFORWARD;
   }
   public void backward() {
      szBetween = SZBACKWARD;
   }
   public void clear() {
       init();
   }
   public void init() {
       this.cursor = EMPTY;
   }
   public int size() {
       return MAXCELLS;
   }
   public Cell getCellRow(int i) {
       return cells[i];
   }
   public int put(Cell cell) {
           cursor++;
           if ( cursor == MAXCELLS ) {
               System.out.println("Error: Too many visualization cells are being used");
               System.out.println("       Increase the size of Cells.MAXCELLS");
               System.out.println("       Currently the value of Cells.MAXCELLS is " + Cells.MAXCELLS);
               System.out.println();
               System.exit(1);
           }
           cursor = (cursor == MAXCELLS) ? 0 : cursor;
           this.cells[cursor] = cell;
           return cursor;
   }
   public void setCellRow(int i, Cell cell) {
           this.cells[i] = cell;
   }

   public String toString() {
       StringBuilder sb = new StringBuilder();
       String bar = StringUtilities.bar(Cell.CELLWIDTH);
       if (cursor > EMPTY ) {
           for (int j=0;j<=cursor;j++) sb.append(bar).append(szBetweenBar);
           sb.append(StringUtilities.NL);

           for (int i=0;i<Cell.CELLHEIGHT;i++) {
               for (int j=0;j<=cursor;j++) {
                   Cell c = cells[j];         
                   if (c != null) {
                       sb.append(c.getCellRow(i)).append(((j==cursor) ? "" : szBetween));
                   }
               }
               sb.append(StringUtilities.NL);
           }

           for (int j=0;j<=cursor;j++) sb.append(bar).append(szBetweenBar);
           sb.append(StringUtilities.NL);

       }
       return sb.toString();
   }
}
class StringUtilities {
    static final String NL = "\n";
    static final String MARK = "+";

    public static String repeat(int n, String s) {
       StringBuilder sb = new StringBuilder(n);
       for (int i=0;i<n;i++) sb.append(s);
       return sb.toString();
    }

    public static String center(String s, int size) {
        return center(s, size, ' ');
    }

    public static String left(String s, int size) {
        StringBuilder sb = new StringBuilder(size);
        sb.append(MARK).append(" ").append(String.format("%1$-" + (size-1) + "s", s)).append(MARK);
        return sb.toString();
    }

    public static String center(String s, int size, char pad) {
        if (s == null || size <= s.length())
            return s;

        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < (size - s.length()) / 2; i++) {
            sb.append(pad);
        }
        sb.append(s);
        while (sb.length() < size) {
            sb.append(pad);
        }
        return MARK + sb.toString() + MARK;
    }

    public static String bar(int size) {
        return MARK + repeat(size, "-")  + MARK;
    }
    
}
