package Planner;

public class ExportData <T extends Document> {

    private T docFormat;

    public ExportData(T format) throws Exception {
        docFormat = format;
    }

    public void exporter(ConvertData<Document> result) throws Exception{
        docFormat.exportFormat(result);
    }
    
}
