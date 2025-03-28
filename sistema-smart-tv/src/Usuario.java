public class Usuario {

    public static void main(String[]args){

        SmartTv smartTv = new SmartTv();
        System.out.println("A tv está: " + smartTv.ligada);
        System.out.println("canal: " + smartTv.canal);
        System.out.println("volume: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(67);
        smartTv.diminuirCanal();
    }
}
