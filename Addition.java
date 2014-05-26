import java.lang.*;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.05.14
 * Time: 8:01
 * To change this template use File | Settings | File Templates.
 */
public class Addition implements Operation{
    @Override
    public Integer apply(Integer first, Integer second){
        return first+second;
    }
}
