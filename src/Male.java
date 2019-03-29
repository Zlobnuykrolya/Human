public class Male extends Human {

    public Male(String name, String surname, float height, float weight, boolean sex) {
        super(name, surname, height, weight, sex);
    }

    @Override
    public String toString() {
        return "Male{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
