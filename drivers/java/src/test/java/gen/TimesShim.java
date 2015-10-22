// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../templates/Test.java
package gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.gen.exc.*;
import com.rethinkdb.gen.ast.*;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Instant;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.Collections;
import java.nio.charset.StandardCharsets;

import static gen.TestingCommon.*;
import gen.TestingFramework;

public class TimesShim {
    Logger logger = LoggerFactory.getLogger(TimesShim.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection<?> conn;
    public String hostname = TestingFramework.getConfig().getHostName();
    public int port = TestingFramework.getConfig().getPort();

    @Before
    public void setUp() throws Exception {
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down.");
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        r.db("rethinkdb").table("_debug_scratch").delete();
        conn.close(false);
    }

    // Autogenerated tests below

        @Test(timeout=120000)
    public void test() throws Exception {
                
        // times/shim.yaml #1
        // t = 1375147296.68
        System.out.println("Possibly executing: Double t = (Double) (1375147296.68);");
        Double t = (Double) (1375147296.68);
                
        {
            // times/shim.yaml #2
            /* ("2013-07-29T18:21:36.680-07:00") */
            String expected_ = "2013-07-29T18:21:36.680-07:00";
            /* r.expr(datetime.fromtimestamp(t, PacificTimeZone())).to_iso8601() */
            System.out.println("About to run #2: r.expr(datetime.fromtimestamp(t, PacificTimeZone())).toIso8601()");
            Object obtained = runOrCatch(r.expr(datetime.fromtimestamp(t, PacificTimeZone())).toIso8601(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #2");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #2");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #2:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/shim.yaml #3
            /* ("2013-07-30T01:21:36.680+00:00") */
            String expected_ = "2013-07-30T01:21:36.680+00:00";
            /* r.expr(datetime.fromtimestamp(t, UTCTimeZone())).to_iso8601() */
            System.out.println("About to run #3: r.expr(datetime.fromtimestamp(t, UTCTimeZone())).toIso8601()");
            Object obtained = runOrCatch(r.expr(datetime.fromtimestamp(t, UTCTimeZone())).toIso8601(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #3");
            try {
                assertEquals(expected_, obtained);
            System.out.println("Finished asserting #3");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #3:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/shim.yaml #4
            /* (1375147296.68) */
            Double expected_ = 1375147296.68;
            /* r.expr(datetime.fromtimestamp(t, PacificTimeZone())).to_epoch_time() */
            System.out.println("About to run #4: r.expr(datetime.fromtimestamp(t, PacificTimeZone())).toEpochTime()");
            Object obtained = runOrCatch(r.expr(datetime.fromtimestamp(t, PacificTimeZone())).toEpochTime(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #4");
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            System.out.println("Finished asserting #4");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #4:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // times/shim.yaml #5
            /* (1375147296.68) */
            Double expected_ = 1375147296.68;
            /* r.expr(datetime.fromtimestamp(t, UTCTimeZone())).to_epoch_time() */
            System.out.println("About to run #5: r.expr(datetime.fromtimestamp(t, UTCTimeZone())).toEpochTime()");
            Object obtained = runOrCatch(r.expr(datetime.fromtimestamp(t, UTCTimeZone())).toEpochTime(),
                                          new OptArgs()
                                          ,conn);
            System.out.println("Finished running #5");
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            System.out.println("Finished asserting #5");
            } catch (Throwable ae) {
                System.out.println("Whoops, got exception on #5:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}