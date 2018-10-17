import javax.swing.JOptionPane;

class Candy {

       private String maker;	//e.g. Hershey’s, Willy Wonka
       private boolean isChocolatey;
       private double price;
       
       public Candy(String maker, boolean isChocolatey, double price) {
    	   this.maker = maker;
    	   this.isChocolatey = isChocolatey;
    	   setPrice(price);
    	   
       }
       public String getMaker() {
    	   return maker;
       }
       public void setMaker(String maker) {
    	   this.maker = maker;
       }
       
       public boolean getisChocolatey() {
    	   return isChocolatey;
       }
       public void setisChocolatey(boolean isChocolatey) {
    	   this.isChocolatey = isChocolatey;
       }
       
       public Double getPrice() {
    	   return price;
       }
       public void setPrice(Double price) {
    	   if (price >=0) {
    		   this.price = price;
    		   
		}
    	   else {
			JOptionPane.showMessageDialog(null, "You need a positive price!");
		}
       }
}

