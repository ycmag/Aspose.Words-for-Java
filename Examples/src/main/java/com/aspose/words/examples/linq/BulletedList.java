package com.aspose.words.examples.linq;
import com.aspose.words.*;
import com.aspose.words.examples.Utils;
import  java.util.*;
public class BulletedList {
    /**
     * The main entry point for the application.
     */
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(BulletedList.class);

        String fileName = "BulletedList.doc";
        // Load the template document.
        Document doc = new Document(dataDir + fileName);

        // Create a Reporting Engine.
        ReportingEngine engine = new ReportingEngine();

        // Execute the build report.
        // engine.getKnownTypes().add(DateUtil.class);
        engine.buildReport(doc, Common.GetClients());

        dataDir = dataDir + Utils.GetOutputFilePath(fileName);

        // Save the finished document to disk.
        doc.save(dataDir);


        System.out.println("\nBulleted list template document is populated with the data about clients.\nFile saved at " + dataDir);

    }
}
