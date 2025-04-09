public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet = null;

    public void takeShowerPet(){

        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho!");
            return;
        }
        this.water -=10;
        this.shampoo -=2;
        pet.setClean();
        System.out.println("O pet está " + pet.getName() + " limpo");
    }

    public void addWater() {

        if(water == 30){
            System.out.println("O volume de água está completamente abastecido!");
        }
        water += 2;
        System.out.println("Volume de água atual: " + water + "/30 L");
    }

    public void addShampoo() {

        if(shampoo == 30){
            System.out.println("O volume de shampoo está completamente abastecido!");
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public boolean havePet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja");
            return;
        }
        if(havePet()){
            System.out.println("O pet " + this.pet.getName() + "esta máquina neste momento!");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + this.pet.getName() + " foi adicionado na maquina com sucesso!");

    }

    public void removePet() {
        this.clean = this.pet.checkClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado!");
        this.pet = null;

    }

    public void cleanMachine(){
        water -= 10;
        shampoo -= 3;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}
