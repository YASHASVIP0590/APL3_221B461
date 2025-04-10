class Gin extends Decorator{
    Gin(Offering offering){
    this.offering =offering;}
    String getName(){
        return offering.getName()+ " withh Gin";
    }
    int getprice(){
        return offering.getprice()+ 45 ;}
    }