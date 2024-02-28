// // // function showMsg(arg: number | string){
// // //     return "hello";
// // // }


// // // showMsg()

// // function showMsg<Type>(arg: <Type>): Type{
// //     return arg
// // }

// // showMsg(1)

// function loadScript(src, callback) {
//     let script = document.createElement('script');
//     script.src = src;
  
//     script.onload = () => callback(null, script);
//     script.onerror = () => callback(new Error(`Script load error for ${src}`));
  
//     document.head.append(script);
//   }

//  function loadScript2(src, callback){
//     let script =  document.createElement('script');
//     script.src = src;

//     const promise = new Promise((res, rej));

//     promise.then((res) => console.log(res))
//     .catch((rej) => console.log(rej))
// }  

// loadScript('https://cdnjs.cloudflare.com/ajax/libs/lodash.js/3.2.0/lodash.js', script => {
//   alert(`Cool, the script ${script.src} is loaded`);
//   alert( _ ); // _ is a function declared in the loaded script
// });


