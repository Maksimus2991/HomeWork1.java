package lesson8;

public  class Human
{
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;


    Human(String name, boolean sex, int age, Human father, Human mother)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    Human(String name, boolean sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String toString()
    {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        if (this.father != null)
            text += ", отец: " + this.father.name;

        if (this.mother != null)
            text += ", мать: " + this.mother.name;

        return text;
    }
}

