// Define a function called mergeArray that takes two arrays as input
function mergeArray(arr1, arr2) {
    // Initialize an empty array to store the merged result
    let mergedArray = [];

    // Initialize two variables to track the indices of arr1 and arr2 respectively
    let i = 0;
    let j = 0;

    // Use a while loop to iterate through both arrays simultaneously until either one reaches its end
    while (i < arr1.length && j < arr2.length) {
        // Compare the current elements of arr1 and arr2
        if (arr1[i] < arr2[j]) {
            // If the element in arr1 is smaller, push it into mergedArray and increment i
            mergedArray.push(arr1[i]);
            i++;
        } else {
            // If the element in arr2 is smaller or equal, push it into mergedArray and increment j
            mergedArray.push(arr2[j]);
            j++;
        }
    }

    // Add any remaining elements from arr1 to mergedArray
    for (; i < arr1.length; i++) {
        mergedArray.push(arr1[i]);
    }

    // Add any remaining elements from arr2 to mergedArray
    for (; j < arr2.length; j++) {
        mergedArray.push(arr2[j]);
    }

    // Return the mergedArray containing all elements from both arrays in sorted order
    return mergedArray;
}

// Define two arrays to merge
let Array1 = [10, 15, 22, 80];
let Array2 = [5, 8, 11, 15, 70];

// Call the mergeArray function with the two arrays and log the result
console.log(mergeArray(Array1, Array2));
