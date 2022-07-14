package Planner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.print.Doc;

import Planner.Data.Priority;


public class CsvFormat implements ImportData, Document {

    @Override
    public Data importFormat() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\polya\\Desktop\\Java_projects\\Planner\\list.csv"));
        Data dt = new Data();
        dt.setTitles(br.readLine());
        System.out.println(dt.getTitles());
        String line = br.readLine();
        br.close();

        String[] tokens = line.split(",");
        dt.setId(tokens[0]);
        dt.setCreationDate(tokens[1]);
        dt.setCreationTime(tokens[2]);
        dt.setDedlineDate(tokens[3]);
        dt.setDedlineTime(tokens[4]);
        dt.setLastName(tokens[5]);
        dt.setFirstName(tokens[6]);
        dt.setPatronymic(tokens[7]);
        dt.setTask(tokens[8]);
        if (tokens[9].contains("высокий")) {
            dt.setPriority(Priority.HIGH);
        } else if (tokens[9].contains("средний")) {
            dt.setPriority(Priority.MIDDLE);
        } else if (tokens[9].contains("низкий")) {
            dt.setPriority(Priority.LOW);
        }
        return dt;
    }

    @Override
    public void addTitles(StringBuilder sb, Data dt) {
        sb.append(dt.getTitles() + "\n");    
    }

    @Override
    public void start(StringBuilder sb) {
    }


    @Override
    public void add(StringBuilder sb, Data dt) {
        sb.append(dt.getId() + "," + dt.getCreationDate() + "," + dt.getCreationTime() + "," + dt.getDedlineDate() + "," + dt.getDedlineTime()
        + "," + dt.getLastName() + "," + dt.getFirstName() + "," + dt.getPatronymic() + "," + dt.getTask() + "," + dt.getPriority());

    }

    @Override
    public void end(StringBuilder sb) {

    }

    @Override
    public void exportFormat(ConvertData<Document> result) throws Exception {
        FileWriter fw = new FileWriter("output.csv");
        fw.write(result.toString());
        fw.close();
        
    }

}
