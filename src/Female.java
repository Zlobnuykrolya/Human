public class Female extends Human {

    public Female(String name, String surname, float height, float weight, boolean sex) {
        super(name, surname, height, weight, sex);
    }

    Human giveBirth(Male male) {
        if (canEndure(male)&&canSpendTimeTogether(male)&&canTalk(male))
        {
            System.out.println(name + " is giving birth");
            if (Math.random() < 0.5){
                return new Female("Ira",male.surname,54,3,false);
            } else {
                return new Male("Niki",male.surname,55,4,true);
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Female{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
