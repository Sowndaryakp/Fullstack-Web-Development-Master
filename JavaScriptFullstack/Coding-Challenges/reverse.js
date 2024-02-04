// //1. reverse character String using for loop
// function reverseString(str){
//     let reversed = "";
//     for(let i=str.length-1;i>=0;i--){
//         reversed += str[i];
//     }
//     return reversed;
// }

// const str = "Interview, Happy";
// const reversedString = reverseString(str);
// console.log(reversedString);


//2. using inbuilt function
// function reveresString(str){
//     return str.split("").reverse().join("");
// }

//reverse words String using for loop
function reverseWords(str){
    let reversedWords = " ";
    let currentWord = " ";
    
    for(let i=0;i<str.length;i++){
        if(str[i]!== ' '){
            currentWord += str[i];
        }else{
            reversedWords = currentWord + ' ' + reversedWords;
            currentWord="";
        }
    }
    reversedWords = currentWord + ' '+ reversedWords; 
        return reversedWords.trim();
}
const str = "Love Coding";
const reveresedWords = reverseWords(str);
console.log(reveresedWords);
  
