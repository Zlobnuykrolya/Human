public abstract class Human {
    String name;
    String surname;
    float height;
    float weight;
    boolean sex;

    public Human(String name, String surname, float height, float weight, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }
    boolean canSpeak(Human human) {
        if (sex == true && human.sex == true) {
            return Math.random() < 0.5;
        } else {
            return true;
        }
    }

    boolean canEndure(Human human) {
        if (sex == false && human.sex == false) {
            return Math.random() < 0.05;
        } else if (sex == false && human.sex == true){
            return Math.random() < 0.7;
        } else if (sex == true && human.sex == false) {
            return Math.random() < 0.7;
        } else {
            return Math.random() < 0.056;
        }
    }

    boolean canSpendTimeTogether(Human human) {
        if (Math.abs(height - human.height) / ((height + human.height) / 2) > 0.1) {
            return Math.random() < 0.85;
        } else {
            return Math.random() < 0.95;
        }
    }

    Human canHaveRelations(Human human) {
        if (canSpeak(human) && canEndure(human) && canSpendTimeTogether(human)) {
            if (sex != human.sex) {
                if (sex == false) {
                    return ((Female) this).giveBirth((Male) human);
                } else {
                    return ((Female) human).giveBirth((Male)this);
                }
            }
        }

        return null;
    }

}
