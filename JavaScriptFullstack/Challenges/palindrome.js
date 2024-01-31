function isPalindrome(word){
    let reversePalindrome = "";

    for(let i=word.length-1;i>=0;i--){
        reversePalindrome += word[i];
    }
    if(word === reversePalindrome){
        console.log("True");
    }
    else{
        console.log("False");
    }
    return reversePalindrome;

    //or 
    // return word===reversePalindrome;
}
const word = "racecar";
const reversedPalindrome = isPalindrome(word);
console.log(reversedPalindrome);