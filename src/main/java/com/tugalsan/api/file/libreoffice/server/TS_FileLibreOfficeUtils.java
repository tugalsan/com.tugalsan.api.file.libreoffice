package com.tugalsan.api.file.libreoffice.server;

import com.tugalsan.api.log.server.TS_Log;

public class TS_FileLibreOfficeUtils {

    private TS_FileLibreOfficeUtils() {

    }

    final private static TS_Log d = TS_Log.of(TS_FileLibreOfficeUtils.class);

    /*
You can use LibreOffice with Java in several ways, primarily through the use of the LibreOffice API (UNO API). Here are some steps to get you started:
1. Install LibreOffice: Make sure you have LibreOffice installed on your machine. You can download it from the official LibreOffice website.
2. Set Up Java Environment: Ensure you have Java Development Kit (JDK) installed on your system. You can download it from the Oracle website or use OpenJDK.
3. Include LibreOffice Libraries: You need to include the LibreOffice Java libraries in your project. These libraries are usually located in the program/classes directory of your LibreOffice installation. You will primarily need juh.jar, jurt.jar, ridl.jar, unoil.jar, and jurt.jar.
4. Write Java Code to Interact with LibreOffice: You can use the following sample code to connect to LibreOffice and perform actions like opening a document or creating a new one:
    */
    
    /*
       import com.sun.star.comp.helper.BootstrapException;
   import com.sun.star.uno.UnoRuntime;
   import com.sun.star.lang.XMultiComponentFactory;
   import com.sun.star.frame.XDesktop;
   import com.sun.star.text.XTextDocument;

   public class LibreOfficeExample {
       public static void main(String[] args) {
           try {
               // Bootstrap the LibreOffice application
               com.sun.star.uno.UnoRuntime.bootstrap();
               XMultiComponentFactory xMCF = UnoRuntime.queryInterface(XMultiComponentFactory.class, com.sun.star.comp.helper.Bootstrap.bootstrap());
               XDesktop xDesktop = UnoRuntime.queryInterface(XDesktop.class, xMCF.createInstance("com.sun.star.frame.Desktop"));

               // Create a new document
               XTextDocument xTextDocument = UnoRuntime.queryInterface(XTextDocument.class, xDesktop.loadComponentFromURL("private:factory/swriter", "_blank", 0, new com.sun.star.beans.PropertyValue[0]));
               
               // Add text to the document
               xTextDocument.getText().setString("Hello LibreOffice from Java!");

               // Save or manipulate the document as needed
               
           } catch (BootstrapException e) {
               e.printStackTrace();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   }
    
    */
    
    /*
    
5. Run Your Java Application: Compile and run your Java application. Make sure that LibreOffice is running in the background, as it needs to be running to allow Java to connect to its API. 
6. Explore Further: The LibreOffice API is extensive, so you can explore additional functionalities such as manipulating spreadsheets, presentations, or accessing other LibreOffice components.
For more detailed information, refer to the LibreOffice SDK documentation and the Java UNO API documentation.
    
    https://api.libreoffice.org/docs/idl/ref/index.html
    https://api.libreoffice.org/docs/java/ref/help-doc.html
    */
    
}
