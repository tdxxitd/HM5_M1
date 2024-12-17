public class Main {
    public static void main(String[] args) {
        Boss newBoss = new Boss();
        newBoss.setHealth(750);
        newBoss.setDamage(55);
        newBoss.setDefence("Magical");

        System.out.println("Info about boss: "+
                " Health:" + newBoss.getHealth() +
                " Damage:" + newBoss.getDamage() +
                " Defence:" + newBoss.getDefence());
        createHeroes();
    }
    public static Hero[] createHeroes() {
        Hero firstHero = new Hero(156, 25, "Invisibility");
        Hero secondHero = new Hero(190, 30);
        Hero thirdHero = new Hero(200, 25, "Strength hit");

        Hero[] heroes = {firstHero, secondHero, thirdHero};
        return heroes;
    }
}