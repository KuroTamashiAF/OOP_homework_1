/**
 * Human
 * класс общих свойств и поведение каждого отднльного индивидуума
 */
public class Human {
    String name;
    int age;
    Sex sex;
    Boolean HaveChildren;

    public Human(String nam, int ag, Sex se, boolean child) {
        name = nam;
        age = ag;
        sex = se;
        HaveChildren = child;
    }
/**
 * вернуть имя 
 */
    public String GetName() {
        return this.name;
    }
/**
 * Вернуть возраст
 */
    public int GetAge() {
        return this.age;
    }
/**
 * Вернуть пол 
 */
    public Sex GetSex(){
        return this.sex;
    }
    /**
     * Вернуть наличие детей 
     */
    public Boolean GetHaveChildren() {
        return this.HaveChildren;
    }
    @Override
    public String toString() {
        return name + " ";
        
    }

}
