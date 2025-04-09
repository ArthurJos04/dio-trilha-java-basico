public class Iphone implements WebNavigator, MediaPlayer, Hardware{

    private String model;
    private int year;
    private String iosVersion;
    private String storage;

    public Iphone(String model, int year, String iosVersion, String storage) {
        this.model = model;
        this.year = year;
        this.iosVersion = iosVersion;
        this.storage = storage;
    }

    public void turnOn(){
        System.out.println("Ligando " + model + " ...");
    }

    public void turnOff(){
        System.out.println("Desligando " + model + " ...");
    }

    public void makeCall(String number){
        System.out.println("Ligando para o número: " + number + " ...");
    }

    public void sendSms(String number, String message) {
        System.out.println("Encaminhando mensagem para o número: " + number + " ...");
        System.out.println("Mensagem: " + message);
    }

    public void acceptCall(){
        System.out.println("Chamada Atendida!");
    }

    public void voiceMail(String number){
        System.out.println("Encaminhando correio de voz para o número: " + number + " ...");
    }

     public void showPageWeb(String url){
        System.out.println("Acessando a pagina: " + url + " ...");
     }

     private static int totalTabs;

     public void addNewTab(){
         totalTabs++;
         System.out.println("Nova Aba Adicionada!");
         System.out.println("Total: " + totalTabs + " Abas Abertas");
     }

    public void removeTab(){
        totalTabs--;
        System.out.println("Aba Removida!");
        System.out.println("Total: " + totalTabs + " Abas Abertas");
    }

     public void updatePageWeb(){
         System.out.println("Página atualizada");
     }

    @Override
    public void selectMusic(String music) {
        System.out.println("Musica Selecionada: " + music);
    }

    public void play(){
         System.out.println("Tocando...");
    }

    public void pause(){
         System.out.println("Pausado...");
    }

}
