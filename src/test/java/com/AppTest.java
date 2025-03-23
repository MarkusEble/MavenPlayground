package com;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {
        assertTrue( true );
        String testSuiteContent = com.compiler.InputReader.fileToString("src/test/resources/test.txt");
    }

    private String readFile(String fileName) throws Exception {
        java.net.URL url = getClass().getClassLoader().getResource(fileName);
        if (url == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        } else {
            java.nio.file.Path resPath = Paths.get(url.toURI());
            return new String(Files.readAllBytes(resPath), "UTF8");
        }
    }
}
