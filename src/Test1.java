/*
 * Test1.java
 */

import rit.ldom.*;

/**
 * "Hello world" document generator.
 * @author James Heliotis
 * @version $Revision: 1.8 $
 */
public class Test1 {

    /**
     * Create and display a document that shows, "Hello, world!"
     * 
     * @param args unused
     */
    public static void main( String[] args ) {
        Document doc = test();
        BrowserUtil.render( doc.generateHTML() );
    }

    public static Document test() {
        Document document = new Document( "Test 1" );

        TextSequence sentenceText = new TextSequence();
        Text hello = new SimpleText( "Hello, " );
        sentenceText.addChild( hello );
        Text world = new SimpleText( "world" );
        Text worldBold = new StyledText( Style.bold, world );
        sentenceText.addChild( worldBold );
        Text exclaim = new SimpleText( "!" );
        sentenceText.addChild( exclaim );
        DocUnit sentence = new Paragraph( 142, sentenceText );

        document.addChild( sentence );

        System.out.println( document.characterCount() +
                            " non white-space characters in the document text."
        );

        System.out.println( "Replacing \"Hello\" with \"He lo\"." );
        document.replace( "Hello", "He lo" );

        System.out.println( document.characterCount() +
                            " non white-space characters in the document text."
        );

        BrowserUtil.displayDocTree( document, "" );
        return document;
    }

}
