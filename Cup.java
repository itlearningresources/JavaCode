import  java.util.*;
//  **************************************************************************
//  **  Cup
//  **************************************************************************

public class Cup {

    //---------------------------------------------+
    // Instance Variables (all private)
    //---------------------------------------------+
    private float volume;
    private String unitofvolume;
    private String color;
    private boolean hot;

    //---------------------------------------------+
    // No Argument Constructor
    //---------------------------------------------+
    public Cup() {
    }

    //---------------------------------------------+
    // Argument Constructor
    //---------------------------------------------+
    public Cup(float volume_in, String unitofvolume_in, String color_in, boolean hot_in) {
        volume = volume_in;
        unitofvolume = unitofvolume_in;
        color = color_in;
        hot = hot_in;
    }

    //---------------------------------------------+
    // Getters and Setters
    //---------------------------------------------+
    public float getVolume() {
        return volume;
    }
    public void setVolume(float volume_in) {
        volume = volume_in;
    }
    public String getUnitofvolume() {
        return unitofvolume;
    }
    public void setUnitofvolume(String unitofvolume_in) {
        unitofvolume = unitofvolume_in;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color_in) {
        color = color_in;
    }
    public boolean getHot() {
        return hot;
    }
    public void setHot(boolean hot_in) {
        hot = hot_in;
    }

    //---------------------------------------------+
    // toString() Method
    //---------------------------------------------+
    public String toString() {
        final String sp = ", ";
        return "volume: " + volume +sp+ "unitofvolume: " + unitofvolume +sp+ "color: " + color +sp+ "hot: " + hot;
    }

    //---------------------------------------------+
    // Main Method - Can be used to test the class
    //---------------------------------------------+
    public static void main(String[] args) {
        int i;
        String sz;
        Cup instance = new Cup();
        System.out.println("static void main(String[] args) of Cup was called");

        //---------------------------------------------+
        // Class Variables
        //---------------------------------------------+
        // float	volume
        // String	unitofvolume
        // String	color
        // boolean	hot

        //---------------------------------------------+
        // Test setters
        //---------------------------------------------+
        System.out.println("Calling:  instance.setVolume(18.3f)");
        instance.setVolume(18.3f);
        String unitofvolume__test = new String("unitofvolume__test_value___muhzycwm");
        System.out.println("Setting:unitofvolume__test to [unitofvolume__test_value___muhzycwm]");
        System.out.println("Calling:  instance.setUnitofvolume(unitofvolume__test)");
        instance.setUnitofvolume(unitofvolume__test);
        String color__test = new String("color__test_value___qbirtico");
        System.out.println("Setting:color__test to [color__test_value___qbirtico]");
        System.out.println("Calling:  instance.setColor(color__test)");
        instance.setColor(color__test);
        System.out.println("Calling:  instance.setHot(true)");
        instance.setHot(true);

        //---------------------------------------------+
        // Test getters
        //---------------------------------------------+
        System.out.println("instance.toString():		" + instance);
        System.out.println("instance.getVolume():        " + instance.getVolume());
        System.out.println("instance.getUnitofvolume():  " + instance.getUnitofvolume());
        System.out.println("instance.getColor():         " + instance.getColor());
        System.out.println("instance.getHot():           " + instance.getHot());

        //---------------------------------------------+
        // Instance Testers
        //---------------------------------------------+
        Cup newobject1 = new Cup(36.6f,  new String("unitofvolume__test_value___iwyteqoq"),  new String("color__test_value___iejxermn"), true);
        System.out.println("newobject1.toString():		" + newobject1);
        System.out.println((new Cup(36.6f,  new String("unitofvolume__test_value___iwyteqoq"),  new String("color__test_value___iejxermn"), true)).toString(););
        Cup newobject2 = new Cup(65.71f,  new String("unitofvolume__test_value___luwwxoaa"),  new String("color__test_value___leihsucj"), true);
        System.out.println("newobject2.toString():		" + newobject2);
        System.out.println((new Cup(65.71f,  new String("unitofvolume__test_value___luwwxoaa"),  new String("color__test_value___leihsucj"), true)).toString(););
        Cup newobject3 = new Cup(24.62f,  new String("unitofvolume__test_value___spjnsjbz"),  new String("color__test_value___vdcqxreu"), true);
        System.out.println("newobject3.toString():		" + newobject3);
        System.out.println((new Cup(24.62f,  new String("unitofvolume__test_value___spjnsjbz"),  new String("color__test_value___vdcqxreu"), true)).toString(););
        Cup newobject4 = new Cup(92.77f,  new String("unitofvolume__test_value___cjjroqno"),  new String("color__test_value___tcwqldsq"), true);
        System.out.println("newobject4.toString():		" + newobject4);
        System.out.println((new Cup(92.77f,  new String("unitofvolume__test_value___cjjroqno"),  new String("color__test_value___tcwqldsq"), true)).toString(););
        Cup newobject5 = new Cup(67.66f,  new String("unitofvolume__test_value___stdiqhtv"),  new String("color__test_value___fbzpqbbe"), true);
        System.out.println("newobject5.toString():		" + newobject5);
        System.out.println((new Cup(67.66f,  new String("unitofvolume__test_value___stdiqhtv"),  new String("color__test_value___fbzpqbbe"), true)).toString(););
        Cup newobject6 = new Cup(62.44f,  new String("unitofvolume__test_value___atnuqhpi"),  new String("color__test_value___tlzzzxor"), true);
        System.out.println("newobject6.toString():		" + newobject6);
        System.out.println((new Cup(62.44f,  new String("unitofvolume__test_value___atnuqhpi"),  new String("color__test_value___tlzzzxor"), true)).toString(););
        Cup newobject7 = new Cup(23.3f,  new String("unitofvolume__test_value___madiwmym"),  new String("color__test_value___fsfesfyx"), true);
        System.out.println("newobject7.toString():		" + newobject7);
        System.out.println((new Cup(23.3f,  new String("unitofvolume__test_value___madiwmym"),  new String("color__test_value___fsfesfyx"), true)).toString(););
        Cup newobject8 = new Cup(68.75f,  new String("unitofvolume__test_value___ehmfbhia"),  new String("color__test_value___tjynjupx"), true);
        System.out.println("newobject8.toString():		" + newobject8);
        System.out.println((new Cup(68.75f,  new String("unitofvolume__test_value___ehmfbhia"),  new String("color__test_value___tjynjupx"), true)).toString(););
        Cup newobject9 = new Cup(62.74f,  new String("unitofvolume__test_value___vlpbmdir"),  new String("color__test_value___xshaxxnv"), true);
        System.out.println("newobject9.toString():		" + newobject9);
        System.out.println((new Cup(62.74f,  new String("unitofvolume__test_value___vlpbmdir"),  new String("color__test_value___xshaxxnv"), true)).toString(););
        Cup newobject10 = new Cup(2.24f,  new String("unitofvolume__test_value___zampasma"),  new String("color__test_value___qpbjzzht"), true);
        System.out.println("newobject10.toString():		" + newobject10);
        System.out.println((new Cup(2.24f,  new String("unitofvolume__test_value___zampasma"),  new String("color__test_value___qpbjzzht"), true)).toString(););
        Cup newobject11 = new Cup(17.85f,  new String("unitofvolume__test_value___cjmunuxh"),  new String("color__test_value___bmjazisj"), true);
        System.out.println("newobject11.toString():		" + newobject11);
        System.out.println((new Cup(17.85f,  new String("unitofvolume__test_value___cjmunuxh"),  new String("color__test_value___bmjazisj"), true)).toString(););
        Cup newobject12 = new Cup(48.84f,  new String("unitofvolume__test_value___hvjarozf"),  new String("color__test_value___rhsoizjj"), true);
        System.out.println("newobject12.toString():		" + newobject12);
        System.out.println((new Cup(48.84f,  new String("unitofvolume__test_value___hvjarozf"),  new String("color__test_value___rhsoizjj"), true)).toString(););
        Cup newobject13 = new Cup(55.77f,  new String("unitofvolume__test_value___crvpigyx"),  new String("color__test_value___eoipoahn"), true);
        System.out.println("newobject13.toString():		" + newobject13);
        System.out.println((new Cup(55.77f,  new String("unitofvolume__test_value___crvpigyx"),  new String("color__test_value___eoipoahn"), true)).toString(););
        Cup newobject14 = new Cup(94.76f,  new String("unitofvolume__test_value___syefdbvm"),  new String("color__test_value___ydxwtmnf"), true);
        System.out.println("newobject14.toString():		" + newobject14);
        System.out.println((new Cup(94.76f,  new String("unitofvolume__test_value___syefdbvm"),  new String("color__test_value___ydxwtmnf"), true)).toString(););
        Cup newobject15 = new Cup(96.36f,  new String("unitofvolume__test_value___yatmornc"),  new String("color__test_value___odvhyxoc"), true);
        System.out.println("newobject15.toString():		" + newobject15);
        System.out.println((new Cup(96.36f,  new String("unitofvolume__test_value___yatmornc"),  new String("color__test_value___odvhyxoc"), true)).toString(););
        Cup newobject16 = new Cup(4.78f,  new String("unitofvolume__test_value___sehoatej"),  new String("color__test_value___zasghprr"), true);
        System.out.println("newobject16.toString():		" + newobject16);
        System.out.println((new Cup(4.78f,  new String("unitofvolume__test_value___sehoatej"),  new String("color__test_value___zasghprr"), true)).toString(););

        //---------------------------------------------+
        // Instance Testers II
        //---------------------------------------------+
        System.out.println((new Cup(48.12f,  new String(unitofvolume__test__test_value___xdbhbncy),  new String(color__test__test_value___cjfgtowa), true)).toString(););
        System.out.println((new Cup(15.12f,  new String(unitofvolume__test__test_value___ofpwnsrq),  new String(color__test__test_value___zgemzaxe), true)).toString(););
        System.out.println((new Cup(22.6f,  new String(unitofvolume__test__test_value___ofuoaylf),  new String(color__test__test_value___bdrjbheh), true)).toString(););
        System.out.println((new Cup(20.46f,  new String(unitofvolume__test__test_value___gtshbrza),  new String(color__test__test_value___jtdybohv), true)).toString(););
        System.out.println((new Cup(56.27f,  new String(unitofvolume__test__test_value___bpcehorx),  new String(color__test__test_value___uudhyfcl), true)).toString(););
        System.out.println((new Cup(42.50f,  new String(unitofvolume__test__test_value___dmhsdjen),  new String(color__test__test_value___nxhhjohw), true)).toString(););
        System.out.println((new Cup(55.82f,  new String(unitofvolume__test__test_value___lulcynuz),  new String(color__test__test_value___zbnlpfmj), true)).toString(););
        System.out.println((new Cup(44.80f,  new String(unitofvolume__test__test_value___flohtnhm),  new String(color__test__test_value___ueeoxgic), true)).toString(););
        System.out.println((new Cup(42.19f,  new String(unitofvolume__test__test_value___iwmysyxg),  new String(color__test__test_value___eifwqrso), true)).toString(););
        System.out.println((new Cup(37.63f,  new String(unitofvolume__test__test_value___ultgdumb),  new String(color__test__test_value___hoqxfeos), true)).toString(););
        System.out.println((new Cup(42.8f,  new String(unitofvolume__test__test_value___roxojvpc),  new String(color__test__test_value___dujowvvg), true)).toString(););
        System.out.println((new Cup(50.11f,  new String(unitofvolume__test__test_value___owcprapi),  new String(color__test__test_value___zzowuorf), true)).toString(););
        System.out.println((new Cup(83.44f,  new String(unitofvolume__test__test_value___ovyixbwu),  new String(color__test__test_value___pnceyuns), true)).toString(););
        System.out.println((new Cup(99.23f,  new String(unitofvolume__test__test_value___hogfrsla),  new String(color__test__test_value___shdmqenb), true)).toString(););
        System.out.println((new Cup(24.42f,  new String(unitofvolume__test__test_value___cncnwawf),  new String(color__test__test_value___nggvhrro), true)).toString(););
        System.out.println((new Cup(74.27f,  new String(unitofvolume__test__test_value___yihbqpur),  new String(color__test__test_value___nylezhzf), true)).toString(););
        System.out.println((new Cup(26.75f,  new String(unitofvolume__test__test_value___uquvnorg),  new String(color__test__test_value___etqvvasv), true)).toString(););
        System.out.println((new Cup(66.22f,  new String(unitofvolume__test__test_value___fuyntzyj),  new String(color__test__test_value___rjaicvvy), true)).toString(););
        System.out.println((new Cup(64.69f,  new String(unitofvolume__test__test_value___wrovdgno),  new String(color__test__test_value___zdrzzeub), true)).toString(););
        System.out.println((new Cup(59.91f,  new String(unitofvolume__test__test_value___bcyguffi),  new String(color__test__test_value___dunvimpt), true)).toString(););
        System.out.println((new Cup(5.38f,  new String(unitofvolume__test__test_value___jthtfqtd),  new String(color__test__test_value___hvlteayg), true)).toString(););
        System.out.println((new Cup(56.17f,  new String(unitofvolume__test__test_value___jcipvyut),  new String(color__test__test_value___jxsxjdyi), true)).toString(););
        System.out.println((new Cup(97.72f,  new String(unitofvolume__test__test_value___lwtlqbfy),  new String(color__test__test_value___geyzsnil), true)).toString(););
        System.out.println((new Cup(59.4f,  new String(unitofvolume__test__test_value___mspzsasx),  new String(color__test__test_value___levttles), true)).toString(););
        System.out.println((new Cup(43.72f,  new String(unitofvolume__test__test_value___ogqhdeea),  new String(color__test__test_value___wxaniaxd), true)).toString(););
        System.out.println((new Cup(21.69f,  new String(unitofvolume__test__test_value___wewlstlx),  new String(color__test__test_value___zaratatq), true)).toString(););
        System.out.println((new Cup(13.20f,  new String(unitofvolume__test__test_value___hovvjnrh),  new String(color__test__test_value___qtonpuhv), true)).toString(););
        System.out.println((new Cup(89.2f,  new String(unitofvolume__test__test_value___bnoytvpa),  new String(color__test__test_value___uhmcoohl), true)).toString(););
        System.out.println((new Cup(90.58f,  new String(unitofvolume__test__test_value___aljupqci),  new String(color__test__test_value___ognducew), true)).toString(););
        System.out.println((new Cup(20.36f,  new String(unitofvolume__test__test_value___oqqqnflc),  new String(color__test__test_value___iowmfnzi), true)).toString(););
        System.out.println((new Cup(96.79f,  new String(unitofvolume__test__test_value___xncrztlw),  new String(color__test__test_value___eljmizfs), true)).toString(););
        System.out.println((new Cup(79.80f,  new String(unitofvolume__test__test_value___fmeapiww),  new String(color__test__test_value___rsqtqyus), true)).toString(););
    }
}
