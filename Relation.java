
public class Relation {
    Human individual1;
    Human individual2;
    RelationType relationtype;

    public Relation(Human p1, Human p2, RelationType type) {
        this.individual1 = p1;
        this.individual2 = p2;
        this.relationtype = type;
    }

    @Override
    public String toString() {
        return "Человек " + individual1 +
                "Человек " + individual2 +
                "Отношения " + relationtype;
    }
}
