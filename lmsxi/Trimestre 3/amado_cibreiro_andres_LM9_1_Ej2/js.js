let nif = prompt("Escriba el numero NIF");
let acumulador = 0;
let letras = "TRWAGMYFPDXBNJZSQVHLCKE"
let resto = 0;

while (nif < 0 || isNaN(nif) || nif.length != 8) {
nif = prompt("Numero invalido, vueva a intentarlo.");
}
resto = nif % 23;
alert("Numero valido! La letra del DNI es: " + letras.charAt(resto));