package Planner;

public class PlannerApp {
    public static void main(String[] args) throws Exception {

        // считываем данные с файла и выводим в консоль
        ImportData newData = new CsvFormat();
        Data dt = new Data();
        dt = newData.importFormat();
        dt.PrintData(dt);

        // корректируем данные и выводим в консоль
        dt.setDedlineTime("15:00");
        dt.PrintData(dt);

        // конвертируем данные в другой формат, если нужно и выводим в консоль
        ConvertData<CsvFormat> convertData = new ConvertData<>(new CsvFormat());
        convertData.addItems(dt);
        System.out.println(convertData);

        // экспортируем данные в файл
        ExportData<CsvFormat> ex = new ExportData<>(new CsvFormat());
        ex.exporter(convertData);
    }
}
