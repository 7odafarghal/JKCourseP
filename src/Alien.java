class Alien extends Creature implements Info {
    public String type;

    @Override
    public void showInfo() {
        System.out.println("Alien type: " + type +".");
        System.out.println("Number of kills: ");
    }
}
