public class Main {
    public static void main(String[] args) {
        Human person1 = new Human("Alex", 31, Sex.MAN, false);
        Human person2 = new Human("Yana", 25, Sex.WOMAN, false);
        Human person3 = new Human("Svetlana", 52, Sex.WOMAN, true);
        Human person4 = new Human("Andrey", 55, Sex.MAN, true);
        Human person5 = new Human("Viktoria", 45, Sex.WOMAN, true);
        Human person6 = new Human("Mihael", 50, Sex.MAN, true);
        Human person7 = new Human("Mihael", 23, Sex.MAN, false);
        Human person8 = new Human("Mary", 19, Sex.WOMAN, false);
        Relation relation1 = new Relation(person1, person2, RelationType.HUSBAND);
        Relation relation2 = new Relation(person1, person3, RelationType.CHILD);
        Relation relation3 = new Relation(person1, person4, RelationType.CHILD);
        Relation relation4 = new Relation(person1, person7, RelationType.BROHER);
        Relation relation5 = new Relation(person2, person1, RelationType.WIFE);
        Relation relation6 = new Relation(person2, person5, RelationType.CHILD);
        Relation relation7 = new Relation(person2, person6, RelationType.CHILD);
        Relation relation8 = new Relation(person2, person8, RelationType.SISTER);
        Relation relation9 = new Relation(person3, person1, RelationType.PARENT);
        Relation relation10 = new Relation(person3, person4, RelationType.WIFE);
        Relation relation11 = new Relation(person3, person7, RelationType.PARENT);
        Relation relation12 = new Relation(person4, person1, RelationType.PARENT);
        Relation relation13 = new Relation(person4, person3, RelationType.HUSBAND);
        Relation relation14 = new Relation(person5, person2, RelationType.PARENT);
        Relation relation15 = new Relation(person5, person6, RelationType.WIFE);
        Relation relation16 = new Relation(person5, person8, RelationType.PARENT);
        Relation relation17 = new Relation(person6, person2, RelationType.PARENT);
        Relation relation18 = new Relation(person6, person5, RelationType.HUSBAND);
        Relation relation19 = new Relation(person6, person5, RelationType.HUSBAND);
        Relation relation20 = new Relation(person7, person1, RelationType.BROHER);
        Relation relation21 = new Relation(person7,person3 , RelationType.PARENT);
        Relation relation22 = new Relation(person8, person2, RelationType.SISTER);
        Relation relation23 = new Relation(person8, person5, RelationType.CHILD);
        





        

    }
}
