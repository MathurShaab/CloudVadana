//B. Perform sorting of an array in descending order.
function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const inputArray = [4, 2, 7, 1, 9, 5];
const sortedArray = sortArrayDescending(inputArray);
console.log(sortedArray);
