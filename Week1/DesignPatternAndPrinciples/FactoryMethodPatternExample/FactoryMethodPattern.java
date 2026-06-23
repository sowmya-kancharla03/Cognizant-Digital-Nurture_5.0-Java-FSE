public class FactoryMethodPattern {

    public static void main(String[] args) {

        DocumentFactory word = new WordFactory();
        DocumentFactory pdf = new PdfFactory();
        DocumentFactory excel = new ExcelFactory();

        Document d1 = word.createDocument();
        Document d2 = pdf.createDocument();
        Document d3 = excel.createDocument();

        d1.Create();
        d2.Create();
        d3.Create();

    }

}