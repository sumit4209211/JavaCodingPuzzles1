function doSomething(digits1, digits2) {
    var result = [];
    var sum;
    var carry = 0;
    var len = Math.min(digits1.length, digits2.length);

    for (var i = 0; i < len; i++) {
        sum = digits1.pop() + digits2.pop() + carry;  // pop() retrieves last element from array. Array is shortened. Returns undefined if array is empty.
        carry = 0;
        if (sum > 9) {
            sum -= 10;
            carry = 1;
        }
        result.unshift(sum); // unshift() inserts an element at the front of the array
    }

    var remainingDigits = [];
    if (digits1.length > 0) {
        remainingDigits = digits1;
    }
    else if (digits2.length > 0) {
        remainingDigits = digits2;
    }

    len = remainingDigits.length;

    for (var i = 0; i < len; i++) {
        sum = remainingDigits.pop() + carry;
        carry = 0;
        if (sum > 9) {
            sum -= 10;
            carry = 1;
        }
        result.unshift(sum);
    }

    if (carry === 1) {
        result.unshift(1);
    }

    return result;
}

console.log(doSomething([8,1], [1,1,5,3]));