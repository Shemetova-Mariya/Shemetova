import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.05.14
 * Time: 7:59
 * To change this template use File | Settings | File Templates.
 */
public class OperationTests {

    public static Addition prepare(){
        return new Addition();
    }

    @Test
    public void testAddition(){
        Addition op = prepare();

        Assert.assertEquals();
        Integer result = op.apply(2,2);

    }

}
