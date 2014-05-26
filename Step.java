import java.math.*;

public class Step implements Operation{
    @Override
    public Integer apply(Integer first, Integer second){
    	//System.out.println(Math.pow(first.intValue(),second.intValue()));
    	return new Integer((int)Math.pow(first.intValue(),second.intValue()));
    }
    
}