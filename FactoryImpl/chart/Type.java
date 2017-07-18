public enum Type {
    
    LINE("line"),
    BAR("bar");

    private String type;

    Type(String type){
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
}