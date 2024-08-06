public class ConcreteExcelDocument implements ExcelDocument {
    @Override
    public void open(){
        System.out.println("opening excel");
    }
    @Override
    public void close(){
        System.out.println("closing excel");
    }
    @Override
    public void save(){
        System.out.println("saving excel");
    }
}