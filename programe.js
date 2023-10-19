var string="hello cloud vadhana";

var reverseallstrings = reverseWord(string,"");

var output = reverseWord(reverseallstrings," ");
console.log(output);
// document.write(output);

function reverseWord(string,separator){
  return string.split(separator).reverse().join(separator);
}