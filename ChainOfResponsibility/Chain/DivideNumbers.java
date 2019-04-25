package Chain;

public class DivideNumbers implements Chain{

	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculationWanted() == "div") {
			System.out.print(request.getNumber1() + " / " + request.getNumber2()+
					" = " + (request.getNumber1()/request.getNumber2()));
		} else {
			if (nextInChain == null) {
				System.out.println("Only works for add, sub, mult, and div");
			} else {
				nextInChain.calculate(request);
			}
		}
	}

}
