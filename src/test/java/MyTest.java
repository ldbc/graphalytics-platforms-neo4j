import org.junit.Test;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import java.io.File;

public class MyTest {

    @Test
    public void test() {
//        new TestGraphDatabaseFactory().newImpermanentDatabase();
        new GraphDatabaseFactory().newEmbeddedDatabase(new File("/tmp/neo4j"));
    }

}
