const str="ssssooiiittefttrr";

const occutrabce=(values)=>{

    let value = values.split('');
    let array=[];
    let x={};

    for(let i=0;i<value.length;i++){
        if(x[value[i]]){
            x[value[i]]++
        }else{
            x[value[i]] =1;
        }
    }
    let output = Object.entries(x).filter((item)=>{
        // console.log(item);
        // console.log(`${item[0]}-${item[1]}`);
        let get = ${item[0]}${item[1]}
            array.push(get);

    })
    //console.log(array);
    return array.join(' ');
}

console.log(occutrabce(str));