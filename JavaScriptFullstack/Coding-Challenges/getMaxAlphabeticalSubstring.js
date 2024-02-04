function getMaxAlphabeticalSubstring(s) {
    const substrings = [];

    // Generate all substrings
    for (let i = 0; i < s.length; i++) {
        for (let j = i + 1; j <= s.length; j++) {
            substrings.push(s.slice(i, j));
        }
    }

    // Implement a simple sorting algorithm (Bubble Sort) without using built-in functions
    for (let i = 0; i < substrings.length - 1; i++) {
        for (let j = 0; j < substrings.length - 1 - i; j++) {
            if (substrings[j] > substrings[j + 1]) {
                // Swap substrings[j] and substrings[j + 1]
                const temp = substrings[j];
                substrings[j] = substrings[j + 1];
                substrings[j + 1] = temp;
            }
        }
    }

    // The last element after sorting is the alphabetically maximum substring
    const maxSubstring = substrings[substrings.length - 1];

    return maxSubstring;
}

// Example usage
const inputString = "baca";
const result = getMaxAlphabeticalSubstring(inputString);
console.log("Input String:", inputString);
console.log("Max Alphabetical Substring:", result);
