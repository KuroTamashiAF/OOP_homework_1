import java.util.ArrayList;
import java.util.List;

public class Research {
    List<Relation> allRelation = new ArrayList<>();

    public ArrayList<Human> findChild(String name) {
        ArrayList<Human> result = new ArrayList<>();
        for (Relation relation : allRelation) {
            if (relation.individual1.name.equals(name) && relation.relationtype == RelationType.PARENT) {
                result.add(relation.individual2);
            }

        }
        return result;
    }
}
