public class Location {

    private String description;
    private String name;

    private Location up;
    private Location down;
    private Location left;
    private Location right;

    public Location(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Location getUp() {
        return up;
    }

    public void setUp(Location up) {
        this.up = up;
    }

    public Location getDown() {
        return down;
    }

    public void setDown(Location down) {
        this.down = down;
    }

    public Location getLeft() {
        return left;
    }

    public void setLeft(Location left) {
        this.left = left;
    }

    public Location getRight() {
        return right;
    }

    public void setRight(Location right) {
        this.right = right;
    }

    public void getDescription(){
        System.out.println("Nachadzas sa v lokacii: " + this.name);
        System.out.println("Popis lokacie: " + this.description);
        System.out.println("mozes ist na: ");

        if (this.getDown() != null)
            System.out.println("JUH " + this.getDown().name);
        if (this.getUp() != null)
            System.out.println("SEVER " + this.getUp().name);
        if (this.getLeft() != null)
            System.out.println("ZAPAD " + this.getLeft().name);
        if (this.getRight() != null)
            System.out.println("VYCHOD " + this.getRight().name);
            System.out.println("-----------------------------");


    }




}
