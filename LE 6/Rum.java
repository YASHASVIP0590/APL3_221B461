class Rum extends Decorator{
    Rum(Offering offering){
    this.offering =offering;}
    String getName(){
        return offering.getName()+ " withh Rum";
    }
    int getprice(){
        return offering.getprice()+ 55 ;}
    }