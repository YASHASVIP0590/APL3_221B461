public class Pandav extends Bharatvanshi {
    boolean kind;
    
    public Pandav(boolean kind) {
        this.kind = kind;
    }
    
    public void obey() {
        System.out.println("Obeying the rules.");
    }

    public void kind() {
        if (kind) {
            System.out.println("Being kind.");
        } else {
            System.out.println("Not so kind.");
        }
    }

    public void fight() {
        System.out.println("Pandav is fighting.");
    }
}
