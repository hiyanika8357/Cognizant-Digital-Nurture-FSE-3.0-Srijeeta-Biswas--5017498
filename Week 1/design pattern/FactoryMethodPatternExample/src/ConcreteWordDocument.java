public class ConcreteWordDocument implements WordDocument {
    @Override
    public void open(){
        System.out.println("opening word");
    }
    @Override
    public void close(){
        System.out.println("closing word");
    }
    @Override
    public void save(){
        System.out.println("saving word");
    }
}