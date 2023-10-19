let arr=[23,76,54,9,79,63,57,64]
function arrSort(arr) { 
    arr.sort((a,b)=>a-b); 
    arr.reverse(); 
    return arr; 
}
console.log(arrSort(arr));
// document.write(arrSort(arr));