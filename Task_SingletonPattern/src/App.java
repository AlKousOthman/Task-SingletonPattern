public class App {
    public static void main(String[] args) throws Exception {

        IPhoneSettings iphonesettings = IPhoneSettings.getInstance();

        iphonesettings.setBrightness(70);
        iphonesettings.setWifi(true);
        
        System.out.println(iphonesettings.getBrightness());
        System.out.println(iphonesettings.getWifi());
    }
}
