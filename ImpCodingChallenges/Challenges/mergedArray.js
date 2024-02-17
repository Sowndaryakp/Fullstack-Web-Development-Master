// // How to merge two sorted Arrays into a Sorted Array?
// let Array1 = [10, 15, 22, 80];
// let Array2 = [5, 8, 11, 15, 70];
function mergeArray(arr1, arr2){
    let mergedArray = []
    let i=0;j=0;

    while(i<arr1.length && j< arr2.length){
        if(arr1[i]<arr2[j]){
            mergedArray.push(arr1[i]);
            i++;
        }else{
            mergedArray.push(arr2[j]);
            j++;
        }
    }

    for(;i<arr1.length;i++){
        mergedArray.push(arr1[i])
    }
    for(;j<arr2.length;j++){
        mergedArray.push(arr2[j]);
    }
    return mergedArray;

}

let Array1 = [10, 15, 22, 80];
let Array2 = [5, 8, 11, 15, 70];
console.log(mergeArray(Array1, Array2));


// function mergeArrays(arr1, arr2) {
//     const mergedArray = [];
//     let i = 0, j = 0;

//     for (; i < arr1.length && j < arr2.length;) {
//         if (arr1[i] < arr2[j]) {
//             mergedArray.push(arr1[i]);
//             i++;
//         } else {
//             mergedArray.push(arr2[j]);
//             j++;
//         }
//     }

//     for (; i < arr1.length; i++) {
//         mergedArray.push(arr1[i]);
//     }
//     for (; j < arr2.length; j++) {
//         mergedArray.push(arr2[j]);
//     }
//     return mergedArray;
// }

// const mergedArray = mergeArrays(Array1, Array2);
// console.log(mergedArray);

