function findLargestWords(sentence){
    const words = sentence.split(" ");
    let longestWord = " ";
    for(let word of words){
        if(word.length > longestWord.length){
            longestWord = word;
        }
    }
    return longestWord;
}
const sentence=  "I Love JavaScript Coding";
const largestWords = findLargestWords(sentence);
console.log(largestWords);