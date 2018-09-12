## Result
-2147483648

## Is it a bug?
No. It is not a bug. Rather we should say, it is a limitation.

## Explanation
Integer.MIN_VALUE has a value of -2^31. But, Integer.MAX_VALUE has a value of 2^31 - 1. So, we cannot actually put a -(-2^31) = 2^31 value where upper limit is 2^31 - 1. So, attempting to do so actually roll over things. This is a well known limitation of ```` Math.abs()````  method.