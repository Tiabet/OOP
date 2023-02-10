public class MyCalculatorProd extends MyCalculator{
		
	 MyCalculatorProd(float num1, float num2){
	        this.num1=num1;
	        this.num2=num2;
	    }
	   //method returing product
	    public float product(){
	        return num1*num2;
	    }
	    //Override doAll method to print product too
	    public void doAll(){
	        System.out.println("sum :"+this.sum());
	        System.out.println("difference :"+this.difference());
	        System.out.println("product :"+this.product());
	    }

}
