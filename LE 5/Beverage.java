abstract class Beverage{
    private void pour(int quantity){
        System.out.println("add"+quantity+"ml of baverage into glass");
    }
    protected abstract void addcondiment();
    protected void stir(){};
    private void serve(){
        System.out.println("serve through waiter");
    }
    public void templatemethod(int quantity){
        pour(quantity);
        addcondiment();
        stir();
        serve();
    }
}