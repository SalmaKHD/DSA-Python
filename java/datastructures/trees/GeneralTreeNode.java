public class GeneralTreeNode {
    public int data;
    public GeneralTreeNode firstChild;
    public GeneralTreeNode nextSibling;
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public GeneralTreeNode getFirrstChild() {
        return firstChild;
    }
    public void setFirstChild(GeneralTreeNode firstChild) {
        this.firstChild = firstChild;
    }
    public GeneralTreeNode getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(GeneralTreeNode nextSibling) {
        this.nextSibling = nextSibling;
    }
}
