var list1 = [];
var list2 = [];
var list3 = [];
var list4 = [];
var list5 = [];
var list6 = [];

var n = 1;
var x = 0;


function AddRow(){
    var table = document.getElementById('show');
    var NewRow = table.insertRow(n);

list1[x] = n;
list2[x] = document.getElementById("fname").value + " " + document.getElementById("lname").value;
list3[x] = document.getElementById("grade1").value;
list4[x] = document.getElementById("grade2").value;

    //Nota final
    var n1 = document.getElementById("grade1").value;
    var n2 = document.getElementById("grade2").value;
    var mean = (Number(n1)+Number(n2))/2;

list5[x] = mean;
list6[x] = document.getElementById("frequency").value + "%";

//Primeira letra do nome/sobrenome maiúscula
NewRow.classList.add("upperCase");


//Mudar a cor da linha conforme a nota e frequência
if (mean >= 7 && document.getElementById("frequency").value >= 75){
    NewRow.classList.add("green");
}
else{
  NewRow.classList.add("red");
}
table.append(NewRow);

var cel1 = NewRow.insertCell(0);
var cel2 = NewRow.insertCell(1);
var cel3 = NewRow.insertCell(2);
var cel4 = NewRow.insertCell(3);
var cel5 = NewRow.insertCell(4);
var cel6 = NewRow.insertCell(5);

cel1.innerHTML = list1[x];
cel2.innerHTML = list2[x];
cel3.innerHTML = list3[x];
cel4.innerHTML = list4[x];
cel5.innerHTML = list5[x];
cel6.innerHTML = list6[x];
 
  n++;
  x++;

}
