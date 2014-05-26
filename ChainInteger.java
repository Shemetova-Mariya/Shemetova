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
        return new ChainInteger(new Addition().apply(integer,number));
    }

    public ChainInteger sub(Integer number){
        return new ChainInteger(new Subtraction().apply(integer,number));
    }

    public static void main(String[] args){

    }
}
