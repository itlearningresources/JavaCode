import java.util.*;


public class UserInput {
    private String prompt;
    private String szInput;

    public UserInput() {
        prompt = "";
        szInput = "";
    }

    public UserInput(String myprompt) {
        prompt = myprompt;
        szInput = "";
    }

    public void setPrompt(String sz)  {
        prompt = sz;
    }

    public String getString()  {
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt + ": ");
        String szIn = scan.next();
        // Here is the code to make sure the user entered a proper String
        return szIn;
    }
    public float getFloat()  {
        float fOut = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt + ": ");
        String szIn = scan.next();
        // Here is the code to make sure the user entered a proper Float
        return fOut;
    }


}
