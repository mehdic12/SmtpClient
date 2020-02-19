package com.hns.gate;

import java.io.IOException;

import com.hns.gate.smtp.SmtpClient;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws IOException 
     */
    public void testApp() throws IOException
    {
        assertTrue( true );
        testSendMail();
    }
    
    
    public void testSendMail() throws IOException { 
    	/* L'adresse IP de votre serveur SMTP */
		String smtpServer = "smtp.gmail.com";
		/* L'adresse de l'expéditeur */
		String from = "sender@xx.xx";
		/* L'adresse du destinataire */
		String to = "receiver12@xx.xx";
		/* L'objet du message */
		String objet = "Objet";
		/* Le corps du mail */
		String texte = "Texte du mail";
         
		SmtpClient smtp = new SmtpClient();
		smtp.sendMail(smtpServer, from, to, objet, texte);
     } 
}
