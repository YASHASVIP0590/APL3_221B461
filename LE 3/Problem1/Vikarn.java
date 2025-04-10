public class Vikarn extends Kaurav {
    boolean kind = true;
    boolean obeying = true;

    public void obey() {
        if (obeying) {
            System.out.println("Vikarn is obedient.");
        }
    }

    public void kind() {
        if (kind) {
            System.out.println("Vikarn is kind.");
        }
    }

    public void fight() {
        System.out.println("Vikarn is fighting.");
    }
}
