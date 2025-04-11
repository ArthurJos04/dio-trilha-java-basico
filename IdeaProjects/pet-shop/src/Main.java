import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;
        do{
            System.out.println("==Escolha uma das opções==");
            System.out.println("1. BANHO NO PET");
            System.out.println("2. ABASTECER AGUA DA MAQUINA");
            System.out.println("3. ABASTECER SHAMPOO DA MAQUINA");
            System.out.println("4. VERIFICAR AGUA DA MAQUINA");
            System.out.println("5. VERIFICAR SHAMPOO DA MAQUINA");
            System.out.println("6. VERIFCAR SE TEM PET NO BANHO");
            System.out.println("7. COLOCAR PET DA MAQUINA");
            System.out.println("8. REMOVER PET DA MAQUINA");
            System.out.println("9. LIMPAR MAQUINA");
            System.out.println("0. SAIR");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeShowerPet();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> checkRefill("Água", petMachine.getWater());
                case 5 -> checkRefill("Shampoo", petMachine.getShampoo());
                case 6 -> checkPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.cleanMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }
        }
        while(true);
    }

    public static void checkRefill(String content, int refill) {
        System.out.println("Volume de " + content + " atual: " + refill + "/" +
                (content.equals("Água") ? "30L" : "10L"));    }
    public static void checkPetInMachine(){
        boolean havePet = petMachine.havePet();
        System.out.println(havePet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInMachine(){
        String name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Digite o nome do pet: ");
            name = scanner.next();
        }
        Pet pet = new Pet(name);
        petMachine.setPet(pet);
    }
}
