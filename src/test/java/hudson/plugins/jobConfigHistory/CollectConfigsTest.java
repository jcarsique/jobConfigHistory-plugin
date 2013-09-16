/*
 * The MIT License
 *
 * Copyright 2013 Mirko Friedenhagen.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package hudson.plugins.jobConfigHistory;

import java.io.File;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author Mirko Friedenhagen
 */
public class CollectConfigsTest {
    
    @Rule
    public final UnpackResourceZip unpackResourceZip = UnpackResourceZip.INSTANCE;

    /**
     * Test of getConfigsForType method, of class CollectConfigs.
     */
    @Test
    public void testGetConfigsForType() throws Exception {
        File itemDir = unpackResourceZip.getResource("config-history/jobs/Test1");
        String prefix = "";
        CollectConfigs sut = new CollectConfigs("deleted");
        List<ConfigInfo> result = sut.getConfigsForType(itemDir, prefix);
        assertEquals(0, result.size());
    }

    /**
     * Test of collect method, of class CollectConfigs.
     */
    @Test
    public void testCollect() throws Exception {        
        File rootDir = unpackResourceZip.getResource("config-history/jobs/Test1");
        String prefix = "";
        CollectConfigs sut = new CollectConfigs("deleted");
        List<ConfigInfo> result = sut.collect(rootDir, prefix);
        assertEquals(0, result.size());
    }    
}
