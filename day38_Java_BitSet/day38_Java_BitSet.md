Java's BitSet class implements a vector of bit values (ie: false (0) or true (1)) that grows as allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of 1 is called a s bit.

Given 2 BitSets, B, and B. of size N where all bits in both BitSets are initialized to 0. perform a series of M operations. Afte each operation, print the number of set bits in the respective BitSets as two space-separated Integers on a new line.

Input Format

The first line contains 2 space-separated Integers, N (the length of both BitSets B, and B) and M (the number of operation

to perform), respectively. The M subsequent lines each contain an operation in one of the following forms:

•AND OR

• XOR

• FLP SET

In the list above, is the integer 1 or 2 where 1 denotes B and 2 denotes B.

is an integer denoting a bit's index in the BitSet corresponding to . For the binary operations AND, OR, and XOR. operands are read from left to right and the BitSet resulting from the

operation replaces the contents of the first operand. For example:

AND 21

By is the left operand, and B is the right operand. This operation should assign the result of B A B to B₂-

Constraints

.15 NS 1000

15 M≤ 10000

Output Format

After each operation, print the respective number of set bits in BitSet B, and BitSet By as 2 space-separated Integers on a n

line.

Sample Input 5 4 AND 12

SET 14

FLIP 2 2

OR 2 1

Sample Output 0 0 1 0 1 1 1 2 Explanation

Initially: N=5. M=4. B-(0,0,0,0,0), and B₂ = (0,0,0,0,0). At each step, we print the respective number of set

bits in B and B as a pair of space-separated integers on a new line.

Mo-AND 12

B-BAB₂-(0,0,0,0,0) A (0,0,0,0,0)-(0,0,0,0,0)

B-(0,0,0,0,0), B₂ = (0,0,0,0,0)

The number of set bits in B and B is 0.

M-SET 14

Set B₁(4) to true (1)

B-(0,0,0,0,1),B,-(0,0,0,0,0).

The number of set bits in B is 1 and B is 0.

M₂-FLIP22

B. 10.0.0.0.13. Ba(0,0,1,0,0). The number of set bits in B1 is 1 and B2 is 2
