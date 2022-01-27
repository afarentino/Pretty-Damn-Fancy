# PDF (Pretty Damn Fancy)

Java PDF Brute Force Cracker.  Works with wordlist or alphabet, to repeatedly attempt to open a PDF file.  This was hacked together to solve a day's problem, and maybe it'll be useful to someone else.

Introduced by the original author in [this blog post](http://seejohncode.com/2010/02/13/java-pdf-cracker/)

## 2022 Update
* Forked to modernize the project.  I had a similar issue with a
  forgotten PDF password when I found John's open-source project.
* Before the code could work against newer PDF's locked 
* with an open password, it's core library needed to be upgraded to iText 7. 
* Being a good web citizen, re-releasing these contributions under the same MIT
* License in case others find it useful 
  to extend or reuse.
---

## Provides the following cracking methods:

    boolean attempt(String password);
    String crackViaWordlistFiles(Collection<String> wordlistFiles);
    String crackViaWordlistFile(String wordlistFile);
    String crackViaWordlist(Collection<String> words);
    String crackViaBruteForce(String alphabet);
    String crackViaBruteForce(String alphabet, int length);
    String crackViaBruteForce(String alphabet, int lower_length, int upper_length);

---

### Dependencies

* iText 7
* BouncyCastle

---

### Author(s)

* John Crepezzi [john.crepezzi@gmail.com](mailto:john.crepezzi@gmail.com)
* Tony Castrogiovanni [afarentino@gmail.com](mailto:afarentino@gmail.com)
---

### License

Licensed under the MIT License (attached)
