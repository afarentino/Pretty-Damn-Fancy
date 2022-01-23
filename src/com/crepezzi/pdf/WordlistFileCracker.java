package com.crepezzi.pdf;
/*
    Copyright (c) 2022 by Tony Castrogiovanni
    <afarentino@gmail.com>

    Permission is hereby granted, free of charge, to any person
    obtaining a copy of this software and associated documentation
    files (the "Software"), to deal in the Software without
    restriction, including without limitation the rights to use,
    copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the
    Software is furnished to do so, subject to the following
    conditions:

    The above copyright notice and this permission notice shall be
    included in all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
    EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
    OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
    NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
    HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
    WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
    OTHER DEALINGS IN THE SOFTWARE.

 */

/**
 * Executes a Wordlist file crack from a thread
 */
public class WordlistFileCracker implements Runnable {
    private String name;
    private String fileName;
    private String wordList;

    public WordlistFileCracker(String s, String fileName, String wordList) {
        this.name = s;
        this.fileName = fileName;
        this.wordList = wordList;
    }

    public void run()
    {
        /**
         * Main Test Driver Program to crack password using iText 7
         * No command-line args provided
         * @param args
         */
        System.out.println("Attempting to crack password for " + this.fileName + " using " + this.wordList);

        try {
            PdfCracker cracker = new PdfCracker(fileName);
            String password = cracker.crackViaWordlistFile(wordList);
            if (password != null) {
                System.out.println("PDF password is: " + password);
            }
            else {
                System.out.println("Password not found in wordlist");
            }
        }
        catch (Exception e) {
            System.out.println("Failed to crack password " + e.getMessage() );
            e.printStackTrace();
        }
    }
}
