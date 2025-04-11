public class Pet {

    private String name;
    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    public String getName() {
        return name;
    }

    public void setClean() {
        this.clean = true;
    }

    public boolean checkClean() {
        return clean;

    }
}
