public class ConcretePdfDocument implements PdfDocument {
    @Override
    public void open(){
        System.out.println("opening pdf");
    }
    @Override
    public void close(){
        System.out.println("closing pdf");
    }
    @Override
    public void save(){
        System.out.println("saving pdf");
    }
}