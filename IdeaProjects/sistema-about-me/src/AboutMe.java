public class AboutMe {

    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        float altura = Float.valueOf(args[3]);

        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade + " " + "anos");
        System.out.println("Altura: " + altura + " cm");
    }
}
