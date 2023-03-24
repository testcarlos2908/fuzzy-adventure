import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarkdownShould {

    @Test
    public void foo(){
        Assertions.assertEquals("foo", "foo");
    }

    @Test
    public void foo_foo(){
        Assertions.assertEquals("foo_foo", "foo");
    }
}
