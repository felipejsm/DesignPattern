import Type;
public class Series {
    private String name;
    private Type type;
    private MarkLine markLine;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Type getType() {
        return type;
    }
    public void setMarkLine(MarkLine markLine) {
        this.markLine = markLine;
    }
    public MarkLine getMarkLine() {
        return markLine;
    }
}