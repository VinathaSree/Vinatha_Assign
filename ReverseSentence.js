let arr = "This is a sunny day";
let charArr = arr.split(" ");
let ans = "";
for(const element of charArr){
    ans += reverse(element)+ " ";
}
function reverse(str){
    let reversed = '';

    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i];
    }

    return reversed;
}
console.log(ans);