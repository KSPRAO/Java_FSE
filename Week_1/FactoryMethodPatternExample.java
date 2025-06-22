public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // Test Factory Method
        DocumentFactory wordFact = new WordDocumentFactory();
        Document word = wordFact.createDocument();
        word.display();
        
        DocumentFactory pdfFact = new PdfDocumentFactory();
        Document pdf = pdfFact.createDocument();
        pdf.display();
        
        DocumentFactory excelFact = new ExcelDocumentFactory();
        Document excel = excelFact.createDocument();
        excel.display();
    }
}

interface Document {
    void display();
}

class WordDocument implements Document {
    public void display() {
        System.out.println("Displaying Word file");
    }
}

class PdfDocument implements Document {
    public void display() {
        System.out.println("Displaying PDF file");
    }
}

class ExcelDocument implements Document {
    public void display() {
        System.out.println("Displaying Excel file");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}