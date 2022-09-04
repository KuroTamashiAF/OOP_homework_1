public class Relation {
    private Human individual1;
    private Human individual2;
    private RelationType relationtype;

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