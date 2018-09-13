## Result
0.8999999999999999

## Why??
Java stores floating points as binary in ```` float ```` and ```` double```` data types. But, in binary format, we cannot always store real floating point value with correct precision. That's where the problem occurs.

## Solution
Use BigDecimal if you need precision. 