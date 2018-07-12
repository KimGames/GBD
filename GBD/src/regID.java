public class regID {

    public int key;
    public RID r;

    public regID(){
        key = -1;
    }

    public regID(int slot, int page, int _key){
        r.setPageId(page);
        r.setSlotId(slot);
    }
}
