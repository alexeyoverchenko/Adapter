public class Adapter extends SecondApplication implements ApplicationImp {

    @Override
    public void creates() {
        insert();
    }

    @Override
    public void reads() {
        select();
    }

    @Override
    public void updates() {
        update();
    }

    @Override
    public void deletes() {
        delete();
    }
}
