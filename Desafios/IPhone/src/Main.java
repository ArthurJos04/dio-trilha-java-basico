public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 15", 2023, "IOS 16", "256 gb");
        iphone.turnOn();
        iphone.makeCall("+55 (11) 98688-3882");
        iphone.sendSms("+55 (11) 98688-3882", "E aí, tudo bem?");
        iphone.acceptCall();
        iphone.voiceMail("+55 (11) 98688-3882");
        iphone.showPageWeb("www.google.com");
        iphone.addNewTab();
        iphone.removeTab();
        iphone.updatePageWeb();
        iphone.selectMusic("Last Resort");
        iphone.pause();
        iphone.play();
        iphone.turnOff();


    }
}
