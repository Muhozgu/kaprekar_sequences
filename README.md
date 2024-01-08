- KaprekarSequences.java -

Kaprekar's sequences are sequences of non-negative integers written using some fixed radix notation. For explanation purposes of the generating rule let's fix the radix r to our traditional decimal notation. The Kaprekar's sequence KSr(n) for starting value n = 253 is:

KS10(253) = 253 à 297 à 693 à 594 à 495 à 495 · [e.g. end of sequence]

Next number in the sequence is computed by taking the difference of maximum possible value using digits of the current number and minimum possible value using same digits. For instance: for current number 297 we obtain 972 - 279 = 693. This "next number" step is repeated until we hit an already generated number in the sequence.

Your task is to program console based application to perform experiments with Kaprekar's sequences. Program behavior is shown in given below printout of sample execution.

As with previous assignment I am going to publish the solution in our repository about 2 weeks from now, so that you can assess your solution and draw conclusions. Î

Here is the printout of program sample execution. User input is highlighted.

Program generates so called Kaprekar sequences KS(n).

Given radix r from [2..36] and starting positive integer n0

the program shows subsequent numbers n(i+1)=max(ni)-min(ni)

until the sequence hits previously generated value.

Values max(ni), min(ni are computed using digits of ni.

Representation radix: r = 10

Start number: n = 8126

8621-1268=7353

7533-3357=4176

7641-1467=6174

7641-1467=6174

Start number: n = 12345

54321-12345=41976

97641-14679=82962

98622-22689=75933

97533-33579=63954

96543-34569=61974

97641-14679=82962

Start number: n = 253

532-235=297

972-279=693

963-369=594

954-459=495

954-459=495

Start number: n = 0

Representation radix: r = 16

Start number: n = 48afb

FBA84-48ABF=B2FC5

FCB52-25BCF=D6F83

FD863-368DF=C6F84

FC864-468CF=B5F95

FB955-559BF=A5F96

FA965-569AF=A3FB6

FBA63-36ABF=C4FA4

FCA44-44ACF=B7F75

FB775-577BF=A3FB6

Start number: n = 0

Representation radix: r = 4

Start number: n = 12321

32211-11223=20322

32220-2223=23331

33321-12333=20322

Start number: n = 312332

333221-122333=210222

222210-12222=203322

332220-22233=303321

333210-12333=320211

322110-11223=310221

322110-11223=310221

Start number: n = 33333

33333-33333=0

0-0=0

ÎStart number: n = 0

Representation radix: r = 36

Start number: n = xzba

ZXBA-ABXZ=PLDB

PLDB-BDLP=E7RM

RME7-7EMR=K7RG

RKG7-7GKR=K3VG

VKG3-3GKV=S3V8

VS83-38SV=SJF8

SJF8-8FJS=K3VG

Start number: n = 0

Representation radix: r = 0

End of program

<<·>>