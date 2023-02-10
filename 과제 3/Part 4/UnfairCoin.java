public class UnfairCoin extends Coin {
	
	private double HeadProb;
	public UnfairCoin(double inputHeadProb) {
		HeadProb=inputHeadProb;
	}
	//HeadProb is input Probability
	//override flip
	public void flip() {
		if(((Math.random()*100))<HeadProb){
			face=0;
		}
		else {
			face=1;
		}
		}
	}

