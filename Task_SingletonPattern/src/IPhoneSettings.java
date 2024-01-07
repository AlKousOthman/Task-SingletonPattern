public class IPhoneSettings {

    private static IPhoneSettings instance;
    private static int brightness;
    private static boolean wifi;


    private IPhoneSettings(){

    }

    public static IPhoneSettings getInstance(){
        if (instance == null){
            instance = new IPhoneSettings();
        }
        return instance;
    }


    public static void setBrightness(int newBrightness){
        brightness = newBrightness;
    }

    public static int getBrightness(){

        return brightness;
    }

    public static void setWifi(boolean newWifi){

        wifi = newWifi;
    }

    public static boolean getWifi(){


        return wifi;
    }




}
