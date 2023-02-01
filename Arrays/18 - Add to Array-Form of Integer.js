var addToArrayForm = function(num, k) {
    return [...((BigInt(num.join().replaceAll(",","")))+ BigInt(k)).toString()];
};