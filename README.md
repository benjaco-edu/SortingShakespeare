# SortingShakespeare
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

Need to convert NanoTime to Hours

https://stackoverflow.com/questions/924208/how-to-convert-nanoseconds-to-seconds-using-the-timeunit-enum

https://www.calculateme.com/time/nanoseconds/to-minutes/

Selection Sorted Array: 5077597.667995
a a a a a a a a a a a a a a a a a a a a 

1.41044379666528 x 10-6 Hours 

About 1:40 hours!

Intsertion Sorted Array: 4767636.946687
a a a a a a a a a a a a a a a a a a a a 
1.32434333 x 10-6 Hours
About 1:20 hours
