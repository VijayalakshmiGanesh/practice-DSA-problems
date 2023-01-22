/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let value =digits.join().replaceAll(",","");
    return [...((BigInt(value))+1n).toString()];
};
