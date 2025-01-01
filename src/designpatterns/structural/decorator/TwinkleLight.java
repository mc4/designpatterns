package designpatterns.structural.decorator;

public class TwinkleLight extends TreeDecorator {

	public TwinkleLight(ChristmasTree tree) {
		super(tree);
	}
	
    public String decorate() {
        return super.decorate() + decorateWithTwinkleLights();
    }
    
    private String decorateWithTwinkleLights() {
        return " with Twinkle Lights";
    }
    
}
