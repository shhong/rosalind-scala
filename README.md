## What is this?

**Rosalind-scala** is a collection of my scala codes that solve the bioinformatics problems at [ROSALIND](http://rosalind.info).

## How to run

I usually run ```sbt``` and ```run test``` to run a program with a test data) or ```run rosalind``` to run with the data provided by ROSALIND. For example,

    $ sbt
    [info] Set current project to default-dd7c11 (in build file:/rosalind-scala/)
    > run test
    [info] Compiling 13 Scala sources to /rosalind-scala/target/scala-2.9.2/classes...

    Multiple main classes detected, select one to run:

     [1] rosalind.EnumeratingGeneOrders
     [2] rosalind.ReverseComplement
     [3] rosalind.CountingNucleotides
     [4] rosalind.Expectation
     [5] rosalind.FindMotif
     [6] rosalind.RNATranscription
     [7] rosalind.PointMutation
     [8] rosalind.SpeedUpMotifFinding
     [9] rosalind.IntroProbability
     [10] rosalind.GCContent
     [11] rosalind.ProteinTranslation
     [12] rosalind.ConsensusProfile

    Enter number: 12

    [info] Running rosalind.ConsensusProfile test
    ATGCAACT
    A: 5 1 0 0 5 5 0 0
    C: 0 0 1 4 2 0 6 1
    G: 1 1 6 3 0 1 0 0
    T: 1 5 0 0 0 1 1 6
    [success] Total time: 5 s, completed Nov 3, 2012 9:40:52 PM


## Some friendly cautions

1. These codes are not of production quality by any means. I am not a scala or bioinformatics expert but wrote these codes for my own education. Therefore, I cannot guarantee that they will function properly for the real world problems in bioinformatics.
2. Please don't copy and paste any part of the codes into your homework, school work, etc., *especially at the ROSALIND website*. It's just wrong and don't do it. 

