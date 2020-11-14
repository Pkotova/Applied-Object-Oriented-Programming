package code;

public enum Face {
    HEAD("HEAD"),
    TAIL("TAIL");

    private  final String value;

    private Face(String newValue){
        this.value = newValue == null ? "HEAD" : newValue ;
    }

    @Override
    public String toString(){
        return String.format("Face: %s",value);
    }
}
