package Planner;

public interface Document {
    
    void addTitles(StringBuilder sb, Data dt);

    void start(StringBuilder sb);

    void add(StringBuilder sb, Data dt);

    void end(StringBuilder sb);

    void exportFormat(ConvertData<Document> result) throws Exception; 

}
