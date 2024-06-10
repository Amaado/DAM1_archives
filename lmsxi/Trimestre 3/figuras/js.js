let preciototal = document.getElementById("precioTotal");


document.getElementById("botonCuadrado").onclick = function AnhadirCarritoCuadrado (){
    let cuadradoContainer = document.getElementsByClassName("cuadradoFigura")[0];
    let precio = cuadradoContainer.getElementsByClassName("precio")[0].textContent;
    let carritoContainer = document.getElementById("carritoContainer");
    let container = carritoContainer.getElementsByClassName("container")[0];

    let nuevoCuadrado = cuadradoContainer.cloneNode(true);
    nuevoCuadrado.style.marginTop = "20px";
    container.appendChild(nuevoCuadrado);

    preciototal.textContent = parseInt(preciototal.textContent) + parseInt(precio);


}



document.getElementById("botonTriangulo").onclick = function AnhadirCarritoCirculo (){
    let trianguloContainer = document.getElementsByClassName("trianguloFigura")[0];
    let precio = trianguloContainer.getElementsByClassName("precio")[0].textContent;
    let carritoContainer = document.getElementById("carritoContainer");
    let container = carritoContainer.getElementsByClassName("container")[0];

    let nuevoTriangulo = trianguloContainer.cloneNode(true);
    nuevoTriangulo.style.marginTop = "20px";
    container.appendChild(nuevoTriangulo);

    preciototal.textContent = parseInt(preciototal.textContent) + parseInt(precio);


}


document.getElementById("botonCirculo").onclick = function AnhadirCarritoTriangulo (){
    let circuloContainer = document.getElementsByClassName("circuloFigura")[0];
    let precio = circuloContainer.getElementsByClassName("precio")[0].textContent;
    let carritoContainer = document.getElementById("carritoContainer");
    let container = carritoContainer.getElementsByClassName("container")[0];

    let nuevoCirculo = circuloContainer.cloneNode(true);
    nuevoCirculo.style.marginTop = "20px";
    container.appendChild(nuevoCirculo);

    preciototal.textContent = parseInt(preciototal.textContent) + parseInt(precio);

    let newCircle = nuevoCirculo.querySelector(".myCircle");
    let contador2 = 1;
    newCircle.addEventListener("click", function() {
        contador2++;
        if (contador2 % 2) {
            this.style.fill = "#D88994";
        } else {
            this.style.fill = "url(#imgPattern)";
        }
    });
}

let contador = 1;
document.addEventListener("DOMContentLoaded", function() {
    const circles = document.querySelectorAll(".myCircle");

    circles.forEach(circle => {
        circle.addEventListener("click", function() {
            contador++;
            if (contador % 2) {
                this.style.fill = "#D88994";
            } else {
                this.style.fill = "url(#imgPattern)";
            }
        });
    });
});
