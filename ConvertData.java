package Planner;

public class ConvertData <T extends Document> {
    
    private StringBuilder sb;
    private T docFormat;

    public ConvertData(T format) {
        sb = new StringBuilder();
        docFormat = format;
        docFormat.start(sb);
    }

    public void addItems(Data dt){
        
        docFormat.addTitles(sb, dt);
        docFormat.add(sb, dt);

    }

    public String end(){
        docFormat.end(sb);
        String t = sb.toString();
        sb = new StringBuilder();
        docFormat.start(sb);
        return t;
    }

    @Override
    public String toString() {
        return end();
    }

}
