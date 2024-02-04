function removeDulpicates(arr){
    const uniqueElements = [];

    for(let i=0;i<arr.length;i++){
        if(uniqueElements.indexOf(arr[i]) === -1){
            uniqueElements.push(arr[i]);
        }
    }
    return uniqueElements;
}

const arr = [1,2,3,4,4,5,6,6];
console.log(removeDulpicates(arr)); 