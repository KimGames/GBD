public class RID {

    private int slotId;
    private int pageId;

    public RID() {
        slotId = -1;
        pageId = -1;
    }

    public RID(int slotId, int pageId) {
        this.slotId = slotId;
        this.pageId = pageId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public void print(){
        System.out.println("Slot ID: " + slotId);
        System.out.println("Page ID: " + pageId);
    }
}
