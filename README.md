# SortingShakespeare
## Assignment
Algorithms &amp; Data Structures - Assignment 1

We want Shakespeares complete works, sorted by word. Meaning that “to be or not to be, that is the question” would be sorted as: “be be is not or question that the to to”.

You’ll find the complete works in the GitHub course repository under Weeklies https://github.com/datsoftlyngby/soft2019spring-algorithms/blob/master/Weeklies/Week_05/Assignment_01/Shakespeare_Complete_Works.txt. You will work in groups of three to create a Java program, that can:

* Read any textfile (as the above into an array or ArrayList)
  * All words should be lower case
   * No punktuations - strip commas, full stops, etc.

* Sort the array using different sorting algorithms:
  * Selection Sort 
  * Insertion Sort 
  * Merge sort
 
* Be extended with other sorting algorithms in the future.

* Measure time consumption for each algorithm and compare them, and discuess the results in a one-page summary.

The solution accompanied with a description in a README.md file should be uploaded (pushed) to a git repository, and a linked should be send to JTF and AKA [Peergrade], no later than Tuesday February 15th, 08:30.

------------
## Measure time consumption for each algorithm and compare them, and discuess the results in a one-page summary.

To develop and test our sorting-solutions, we copied the shakespeare-document and only kept about 30-40 lines of the beginning of the document.  
This was done so we could easier and quicker test if our solutions actually worked, and adjust if any errors were found.

After having confirmed that all the sorting-algorithms actually worked, we then put Christian's computer through the paces and made it sort the full and complete shakespeare-document using the 3 developed sorting algorithms. 

**Note**: We've removed the testing setup and test .txt-file, so be warned, if you run the current project you will be running the 3 sortings on the whole Shakespeare-document! 

Just for a bit of clarification of the machine that was going to handle sorting this:



*   **CPU**: *Intel i7-6700k / 4 Cores at 4.0GHz / 8 Threads*
*   **Ram**: *16GB DDR4 2666Mhz*
*   **Disk**: *2TB HDD*
*   **GPU**: *Nvidia 980TI 6GB GDDR5*
*   **OS**: *Windows 10 Pro, running on a 512GB SSD*

So what were the results?...

… and how long did Christian's computer spent crunching the assignment?

Please note, that we got the results back in NanoTime.



*   **Selection Sort**: *5077597.667995*
*   **Insertion Sort**: *4767636.946687*
*   **Merge (Bottom up) Sort**: *1368116.154955*

Using a nanotime calculater on [https://www.calculateme.com/time/nanoseconds/to-minutes/](https://www.calculateme.com/time/nanoseconds/to-minutes/), we've been able to convert our results to the following:



*   **Selection Sort**: *1.41044379666528 x 10-6 Hours*
*   **Insertion Sort**: *1.32434333 x 10-6 Hours*
*   **Merge (Bottom up) Sort**: *3.80032265265278 x 10-7*

Based on Christian's recollection, we started the program at around 17:10, and the program finished at about 20:10-20:15, so that's about 3 hours in total to sort the shakespeare-document, using the 3 sorting algorithms!

The conversion of the nanotime to hours isn't exactly beautiful, but a more accurate time conversion would perhaps look a bit more like this:



*   **Selection Sort**: *About 1 hour and 26  minutes*
*   **Insertion Sort**: *About 1 hour and 21 minutes*
*   **Merge (Bottom up) Sort**: *About 20 minutes *
    *   (Christian is very sure that the "Insertion Sort" ended at about 19:50, in which the Merge sort would have started right afterwards, and which ended at around 20:10-20.15)

Based on our results, here is our rank of the fastest-to-slowest sorting:



1.  **Merge (Bottom up) Sort**
1.  Insertion Sort
1.  Selection Sort

It was quite incredible to see that the *Merge-sorting* not just beat the other two sorting algorithms, but in such a huge way! 
 
The *Merge-sort* (based on our test run) was about 3x times faster than the others, while the time difference between the *Insertion-* and *Selection*-sort wasn't that huge, perhaps only a 5-10 minutes difference, if we adjusted the time calculation to *HH:MM:SS* and re-ran the test.


---------------
### Results Page
Need to convert NanoTime to Hours

https://stackoverflow.com/questions/924208/how-to-convert-nanoseconds-to-seconds-using-the-timeunit-enum

https://www.calculateme.com/time/nanoseconds/to-minutes/

Selection Sorted Array: 5077597.667995
a a a a a a a a a a a a a a a a a a a a 

1.41044379666528 x 10-6 Hours 

About 1:27 hours!

----------------

Intsertion Sorted Array: 4767636.946687

1.32434333 x 10-6 Hours

About 1:21 hours

----------------

Merge (Bottom Up) Sorted Array: 1368116.154955

3.80032265265278 x 10-7

About 20 minuts 
