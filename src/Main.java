public class Main {
    public static void main(String[] args) {

        Female femaleAnya = new Female("Anya","Kamikadze",165,60,false);
        System.out.println(femaleAnya.toString());

        Male maleIllia = new Male("Illia", "Kamikadze", 178, 85, true);
        System.out.println(maleIllia.toString());

        Human child = femaleAnya.giveBirth(maleIllia);
        if (child != null) {
            System.out.println(child.toString());
        } else {
            System.out.println("Nothing happened... Broke up");
        }

    }
}
