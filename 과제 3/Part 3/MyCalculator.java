public class MyCalculator {
		float num1;
	    float num2;
	   
	    MyCalculator() {}
	    MyCalculator(float num1, float num2){
	        this.num1=num1;
	        this.num2=num2;
	    }
	    //method returning sum
	    public float sum() {
	        return num1 + num2;
	    }
	    //method returning difference
	    public float difference(){
	        return num1-num2;
	    }
	    //doAll method printing the result sum and difference
	    public void doAll(){
	        System.out.println("sum :"+this.sum());
	        System.out.println("difference :"+this.difference());
	    }
	
	}
