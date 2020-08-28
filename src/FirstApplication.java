public class FirstApplication implements ApplicationImp {

    @Override
    public void creates() {
        System.out.println("It's create");
    }

    @Override
    public void reads() {
        System.out.println("It's read");
    }

    @Override
    public void updates() {
        System.out.println("It's update");
    }

    @Override
    public void deletes() {
        System.out.println("It's delite");
    }
}
