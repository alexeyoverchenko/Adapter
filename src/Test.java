public class Test {
    public static void main(String[] args) {
        ApplicationImp applicationImp = new Adapter();

        applicationImp.creates();
        applicationImp.reads();
        applicationImp.updates();
        applicationImp.deletes();

    }
}
