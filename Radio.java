import  java.util.*;
//  **************************************************************************
//  **  Radio
//  **************************************************************************

public class Radio {

    //---------------------------------------------+
    // Instance Variables (all private)
    //---------------------------------------------+
    private Boolean on;
    private String band;
    private float channel;
    private int volume;
    private int balance;
    private int tone;
    private Double powerboost;
    private int radiobutton;

    //---------------------------------------------+
    // No Argument Constructor
    //---------------------------------------------+
    public Radio() {
    }

    //---------------------------------------------+
    // Argument Constructor
    //---------------------------------------------+
    public Radio(Boolean on_in, String band_in, float channel_in, int volume_in, int balance_in, int tone_in, Double powerboost_in, int radiobutton_in) {
        on = on_in;
        band = band_in;
        channel = channel_in;
        volume = volume_in;
        balance = balance_in;
        tone = tone_in;
        powerboost = powerboost_in;
        radiobutton = radiobutton_in;
    }

    //---------------------------------------------+
    // Getters and Setters
    //---------------------------------------------+
    public Boolean getOn() {
        return on;
    }
    public void setOn(Boolean on_in) {
        on = on_in;
    }
    public String getBand() {
        return band;
    }
    public void setBand(String band_in) {
        band = band_in;
    }
    public float getChannel() {
        return channel;
    }
    public void setChannel(float channel_in) {
        channel = channel_in;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume_in) {
        volume = volume_in;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance_in) {
        balance = balance_in;
    }
    public int getTone() {
        return tone;
    }
    public void setTone(int tone_in) {
        tone = tone_in;
    }
    public Double getPowerboost() {
        return powerboost;
    }
    public void setPowerboost(Double powerboost_in) {
        powerboost = powerboost_in;
    }
    public int getRadiobutton() {
        return radiobutton;
    }
    public void setRadiobutton(int radiobutton_in) {
        radiobutton = radiobutton_in;
    }

    //---------------------------------------------+
    // toString() Method
    //---------------------------------------------+
    public String toString() {
        final String sp = ", ";
        return "on: " + on +sp+ "band: " + band +sp+ "channel: " + channel +sp+ "volume: " + volume +sp+ "balance: " + balance +sp+ "tone: " + tone +sp+ "powerboost: " + powerboost +sp+ "radiobutton: " + radiobutton;
    }

    //---------------------------------------------+
    // Main Method - Can be used to test the class
    //---------------------------------------------+
    public static void main(String[] args) {
        int i;
        String sz;
        Radio instance = new Radio();
        System.out.println("static void main(String[] args) of Radio was called");

        //---------------------------------------------+
        // Class Variables
        //---------------------------------------------+
        // Boolean	on
        // String	band
        // float	channel
        // int		volume
        // int		balance
        // int		tone
        // Double	powerboost
        // int		radiobutton

        //---------------------------------------------+
        // Test setters
        //---------------------------------------------+
        Boolean on__test = new Boolean(false);
        System.out.println("Setting:on__test to [false]");
        System.out.println("Calling:  instance.setOn(on__test)");
        instance.setOn(on__test);
        String band__test = new String("band__test_value___rpnzomwj");
        System.out.println("Setting:band__test to [band__test_value___rpnzomwj]");
        System.out.println("Calling:  instance.setBand(band__test)");
        instance.setBand(band__test);
        System.out.println("Calling:  instance.setChannel(59.15f)");
        instance.setChannel(59.15f);
        System.out.println("Calling:  instance.setVolume(66)");
        instance.setVolume(66);
        System.out.println("Calling:  instance.setBalance(3)");
        instance.setBalance(3);
        System.out.println("Calling:  instance.setTone(71)");
        instance.setTone(71);
        Double powerboost__test = new Double(91.25d);
        System.out.println("Setting:powerboost__test to [91.25d]");
        System.out.println("Calling:  instance.setPowerboost(powerboost__test)");
        instance.setPowerboost(powerboost__test);
        System.out.println("Calling:  instance.setRadiobutton(64)");
        instance.setRadiobutton(64);

        //---------------------------------------------+
        // Test getters
        //---------------------------------------------+
        System.out.println("instance.toString():		" + instance);
        System.out.println("instance.getOn():            " + instance.getOn());
        System.out.println("instance.getBand():          " + instance.getBand());
        System.out.println("instance.getChannel():       " + instance.getChannel());
        System.out.println("instance.getVolume():        " + instance.getVolume());
        System.out.println("instance.getBalance():       " + instance.getBalance());
        System.out.println("instance.getTone():          " + instance.getTone());
        System.out.println("instance.getPowerboost():    " + instance.getPowerboost());
        System.out.println("instance.getRadiobutton():   " + instance.getRadiobutton());

        //---------------------------------------------+
        // Instance Testers
        //---------------------------------------------+
        Radio newobject1 = new Radio( new Boolean(false),  new String("band__test_value___dhxlfcot"), 71.15f, 85, 15, 77,  new Double(29.21d), 76);
        System.out.println("newobject1.toString():		" + newobject1);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___dhxlfcot"), 71.15f, 85, 15, 77,  new Double(29.21d), 76)).toString(););
        Radio newobject2 = new Radio( new Boolean(false),  new String("band__test_value___tqivozjp"), 66.28f, 80, 16, 44,  new Double(11.74d), 95);
        System.out.println("newobject2.toString():		" + newobject2);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___tqivozjp"), 66.28f, 80, 16, 44,  new Double(11.74d), 95)).toString(););
        Radio newobject3 = new Radio( new Boolean(false),  new String("band__test_value___rzjjptih"), 44.55f, 60, 55, 65,  new Double(94.1d), 34);
        System.out.println("newobject3.toString():		" + newobject3);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___rzjjptih"), 44.55f, 60, 55, 65,  new Double(94.1d), 34)).toString(););
        Radio newobject4 = new Radio( new Boolean(false),  new String("band__test_value___utuaiczg"), 76.8f, 24, 45, 5,  new Double(35.11d), 24);
        System.out.println("newobject4.toString():		" + newobject4);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___utuaiczg"), 76.8f, 24, 45, 5,  new Double(35.11d), 24)).toString(););
        Radio newobject5 = new Radio( new Boolean(false),  new String("band__test_value___dylxwhli"), 17.37f, 99, 37, 5,  new Double(7.3d), 21);
        System.out.println("newobject5.toString():		" + newobject5);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___dylxwhli"), 17.37f, 99, 37, 5,  new Double(7.3d), 21)).toString(););
        Radio newobject6 = new Radio( new Boolean(false),  new String("band__test_value___obresvtn"), 74.47f, 5, 82, 97,  new Double(52.41d), 24);
        System.out.println("newobject6.toString():		" + newobject6);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___obresvtn"), 74.47f, 5, 82, 97,  new Double(52.41d), 24)).toString(););
        Radio newobject7 = new Radio( new Boolean(false),  new String("band__test_value___ajqlhqbc"), 96.90f, 67, 48, 61,  new Double(99.26d), 38);
        System.out.println("newobject7.toString():		" + newobject7);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___ajqlhqbc"), 96.90f, 67, 48, 61,  new Double(99.26d), 38)).toString(););
        Radio newobject8 = new Radio( new Boolean(false),  new String("band__test_value___vwdurnrs"), 34.26f, 28, 23, 69,  new Double(1.99d), 14);
        System.out.println("newobject8.toString():		" + newobject8);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___vwdurnrs"), 34.26f, 28, 23, 69,  new Double(1.99d), 14)).toString(););
        Radio newobject9 = new Radio( new Boolean(false),  new String("band__test_value___domeodei"), 14.6f, 11, 15, 66,  new Double(26.26d), 77);
        System.out.println("newobject9.toString():		" + newobject9);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___domeodei"), 14.6f, 11, 15, 66,  new Double(26.26d), 77)).toString(););
        Radio newobject10 = new Radio( new Boolean(false),  new String("band__test_value___odwftucf"), 42.7f, 97, 42, 25,  new Double(56.60d), 20);
        System.out.println("newobject10.toString():		" + newobject10);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___odwftucf"), 42.7f, 97, 42, 25,  new Double(56.60d), 20)).toString(););
        Radio newobject11 = new Radio( new Boolean(false),  new String("band__test_value___svemfryj"), 87.98f, 37, 83, 35,  new Double(98.60d), 76);
        System.out.println("newobject11.toString():		" + newobject11);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___svemfryj"), 87.98f, 37, 83, 35,  new Double(98.60d), 76)).toString(););
        Radio newobject12 = new Radio( new Boolean(false),  new String("band__test_value___ypzsoacp"), 45.37f, 36, 26, 80,  new Double(95.83d), 37);
        System.out.println("newobject12.toString():		" + newobject12);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___ypzsoacp"), 45.37f, 36, 26, 80,  new Double(95.83d), 37)).toString(););
        Radio newobject13 = new Radio( new Boolean(false),  new String("band__test_value___vebiirrx"), 39.85f, 36, 26, 90,  new Double(58.77d), 57);
        System.out.println("newobject13.toString():		" + newobject13);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___vebiirrx"), 39.85f, 36, 26, 90,  new Double(58.77d), 57)).toString(););
        Radio newobject14 = new Radio( new Boolean(false),  new String("band__test_value___daledupb"), 84.22f, 7, 82, 42,  new Double(67.33d), 97);
        System.out.println("newobject14.toString():		" + newobject14);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___daledupb"), 84.22f, 7, 82, 42,  new Double(67.33d), 97)).toString(););
        Radio newobject15 = new Radio( new Boolean(false),  new String("band__test_value___jcbtqejr"), 70.96f, 48, 31, 74,  new Double(8.37d), 12);
        System.out.println("newobject15.toString():		" + newobject15);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___jcbtqejr"), 70.96f, 48, 31, 74,  new Double(8.37d), 12)).toString(););
        Radio newobject16 = new Radio( new Boolean(false),  new String("band__test_value___whdnodxb"), 87.60f, 56, 5, 75,  new Double(92.4d), 90);
        System.out.println("newobject16.toString():		" + newobject16);
        System.out.println((new Radio( new Boolean(false),  new String("band__test_value___whdnodxb"), 87.60f, 56, 5, 75,  new Double(92.4d), 90)).toString(););

        //---------------------------------------------+
        // Instance Testers II
        //---------------------------------------------+
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___ujxwbuth), 64.48f, 36, 83, 38,  new Double(29.19d), 61)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___phmbvjmr), 96.23f, 94, 45, 26,  new Double(14.66d), 63)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___pgmxnaqb), 26.79f, 65, 54, 19,  new Double(39.76d), 7)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___pubfuuic), 33.82f, 20, 59, 15,  new Double(33.15d), 49)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___vhmiaipj), 60.79f, 67, 55, 49,  new Double(76.90d), 23)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___qmnhnnna), 13.31f, 99, 36, 85,  new Double(86.24d), 1)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___apugzmex), 39.35f, 24, 76, 58,  new Double(58.34d), 71)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___pvcymvij), 17.64f, 63, 18, 74,  new Double(85.93d), 25)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___dgodymyn), 97.82f, 38, 26, 68,  new Double(45.0d), 10)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___qzheflfn), 67.23f, 76, 82, 80,  new Double(94.56d), 68)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___mivxhrrq), 84.84f, 47, 91, 34,  new Double(36.40d), 30)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___azaufxhz), 7.97f, 51, 66, 78,  new Double(67.76d), 7)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___uxnscidr), 16.17f, 84, 78, 36,  new Double(6.1d), 42)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___mawwttwt), 48.31f, 69, 62, 78,  new Double(68.65d), 98)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___uqwofgnt), 7.68f, 9, 46, 72,  new Double(97.15d), 59)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___tdileoqn), 85.43f, 85, 54, 92,  new Double(30.34d), 74)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___innyewch), 17.89f, 82, 53, 94,  new Double(11.52d), 34)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___tblqlaui), 23.65f, 41, 28, 95,  new Double(42.7d), 13)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___hjbxgyfq), 31.17f, 99, 90, 35,  new Double(26.5d), 25)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___ifrlsteg), 42.77f, 15, 93, 86,  new Double(85.38d), 86)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___nsnybzel), 0.18f, 16, 50, 64,  new Double(91.50d), 27)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___eltvhofn), 75.25f, 40, 1, 4,  new Double(31.30d), 29)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___nseqsdxx), 76.31f, 79, 17, 20,  new Double(22.25d), 29)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___qjtojcdf), 27.53f, 36, 29, 83,  new Double(69.8d), 62)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___jbjijnte), 4.27f, 82, 43, 11,  new Double(72.83d), 40)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___bwzwsisd), 74.90f, 58, 16, 19,  new Double(40.60d), 48)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___ntpyyhpa), 90.74f, 56, 46, 78,  new Double(52.49d), 49)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___yxainnai), 23.78f, 25, 89, 35,  new Double(34.56d), 54)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___vqmpyypa), 49.79f, 35, 49, 60,  new Double(7.92d), 29)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___lghwczzg), 29.75f, 81, 11, 75,  new Double(13.53d), 89)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___lqbropqu), 41.46f, 61, 85, 11,  new Double(8.31d), 69)).toString());
        System.out.println((new Radio( new Boolean(false),  new String(band__test__test_value___amovawwl), 23.86f, 27, 36, 31,  new Double(15.8d), 98)).toString());
    }
}
