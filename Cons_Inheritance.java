class Vehicles{
    String modelname;
    int year;
    String fueltype;
    public String getModelname() {
        return modelname;
    }
    public void setModelname(String mn) {
        this.modelname = mn;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int yr) {
        this.year = yr;
    }
    public String getFueltype() {
        return fueltype;
    }
    public void setFueltype(String ft) {
        this.fueltype = ft;
    }
    
}

// tata_harrier is instance of Vehicles classs....

class tata_harrier extends Vehicles{
     String variant;
     boolean isautomatic;
     double price;
    
     public String getVariant() {
        return variant;
    }
    public void setVariant(String var) {
        this.variant = var;
    }
    public String isIsautomatic() {
        return isautomatic? " yes" : "No";      /* we can use if-esle statement but we use ternary operator to shorthand 
                                                        the code */ 
    }
    public void setIsautomatic(boolean isauto) {
        this.isautomatic = isauto;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double pr){
        this.price = pr;
    }

}

public class Cons_Inheritance {
    public static void main(String[] args) {
         
     // we use  set method to setting the name of model 
  
     // setting the properties inherits from the vehicles    
     tata_harrier harrier = new tata_harrier(); 
     harrier.setModelname("tata herrier");  
     harrier.setFueltype("diesel ");
     harrier.setYear(2023);

     // setting the prooerties specfic to tata_herrier

     harrier.setVariant(" herrier pure plus");
     harrier.setIsautomatic(true);
     harrier.setprice(18.69);

     // now we print properties  

     System.out.println(" Model name : " + harrier.getModelname());
     System.out.println(" Fuel type : " + harrier.getFueltype());
     System.out.println(" Year : " + harrier.getYear());
     System.out.println(" Variant name : " + harrier.getVariant());
     System.out.println(" Automatic : " + harrier.isIsautomatic());
     System.out.println(" On road price : " + harrier.getprice() + " lakh");
     
    }
}
