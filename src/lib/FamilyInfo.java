package lib;
import java.util.ArrayList;
import java.util.List;

public class FamilyInfo {
    private SpouseInfo spouse;
    private final List<ChildInfo> children;

    public FamilyInfo() {
        this.children = new ArrayList<>();
    }

    public void setSpouse(SpouseInfo spouse) {
        this.spouse = spouse;
    }

    public void addChild(ChildInfo child) {
        this.children.add(child);
    }

    public int getNumberOfChildren() {
        return children.size();
    }
}
