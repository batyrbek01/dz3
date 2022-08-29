public class Main {
    public static int bossHealth = 700;
    public static int bossDamage = 50;

    public static int[] heroesHealth = {270, 280, 260, 95};
    public static int[] heroesDamage = {20, 15, 25, 20};

    public static String[] heroesAttackType = {"Physical","Magical","Kinetic", "Medic","Golem"};

    public static int roundNumber = 0;

    public static void main(String[] args) {
        printStatistics();
    }
    public static void printStatistics(){
        System.out.println(" "+ roundNumber + " ROUND ");
        System.out.println  ("Boss health: "+ bossHealth + " ["+ bossDamage +" ] ");
    }
}

