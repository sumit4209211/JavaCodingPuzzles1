var CodeOptimization = /** @class */ (function () {
    function CodeOptimization() {
    }
    CodeOptimization.main = function (args) {
        var a = [8,1];
        var b = [1, 1, 5, 3];
        var add = CodeOptimization.add(a, b);
        for (var i = 0; i < add.length; i++) {
            {
                console.info(add[i]+ " ");
            }
            ;
        }
    };
    CodeOptimization.add = function (first, second) {
        var findLargest = first.length > second.length ? true : false;
        var length = first.length > second.length ? first.length : second.length;
        var result = (function (s) { var a = []; while (s-- > 0)
            a.push(0); return a; })(length);
        var carry = 0;
        for (var i = 0; i < length; i++) {
            {
                var count = 0;
                if (findLargest) {
                    if (second.length > i) {
                        count = first[length - (i + 1)] + second[second.length - (i + 1)] + carry;
                        if (count > 9) {
                            carry = 1;
                            count = count + 10;
                        }
                        else
                            carry = 0;
                    }
                    else {
                        count = first[length - (i + 1)] + carry;
                        carry = 0;
                    }
                }
                else {
                    if (first.length > i) {
                        count = first[first.length - (i + 1)] + second[length - (i + 1)] + carry;
                        if (count > 9) {
                            carry = 1;
                            count = count - 10;
                        }
                        else
                            carry = 0;
                    }
                    else {
                        count = second[length - (i + 1)] + carry;
                        carry = 0;
                    }
                }
                result[length-i-1] = count;
            }
            ;
        }
        return result;
    };
    return CodeOptimization;
}());
CodeOptimization["__class"] = "CodeOptimization";
CodeOptimization.main(null);