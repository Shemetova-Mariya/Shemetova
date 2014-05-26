/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.05.14
 * Time: 7:56
 * To change this template use File | Settings | File Templates.
 */
public class ChainInteger {
    private Integer integer;

    public ChainInteger(Integer integer){
        this.integer=integer;
    }

    public ChainInteger add(Integer number){
        return new ChainInteger((new Addition()).apply(integer,number));
    }

    public ChainInteger subtraction(Integer number){
        return new ChainInteger(new Subtraction().apply(integer,number));
    }

    public static void main(String[] args){
		ChainInteger ch = new ChainInteger(5);
		//ch.integer == 5
		
		ChainInteger q = ch.add(3);
		//q.integer == 8;
		
		q = ch.subtraction(7);
		//q.integer == 1;
    }
}
